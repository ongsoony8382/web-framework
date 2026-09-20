package yu.spring.ch1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yu.spring.ch1.model.Member;
import yu.spring.ch1.model.MemberRequestDTO;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<Member> selectAll(){
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> selectOne(@PathVariable int id){
        Member member = memberService.findById(id);
        if (member != null){
            return ResponseEntity.ok(member);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Member insert(@RequestBody MemberRequestDTO memberRequestDTO){
        return memberService.insert(memberRequestDTO);
    }

    @PutMapping("/{id}")
    public  Member update(@PathVariable int id, @RequestBody MemberRequestDTO memberRequestDTO){
        return memberService.update(id, memberRequestDTO);
    }

    @DeleteMapping("/{id}")
    public List<Member> delete(@PathVariable int id){
        return memberService.deleteById(id);
    }
}
