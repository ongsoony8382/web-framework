package yu.spring.ch1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yu.spring.ch1.model.Member;
import yu.spring.ch1.model.MemberRepository;
import yu.spring.ch1.model.MemberRequestDTO;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public Member findById(int id){
        return memberRepository.findById(id).orElse(null);
    }

    public Member insert(MemberRequestDTO memberRequestDTO){
        Member member = new Member();
        member.setName(memberRequestDTO.getName());
        member.setEmail(memberRequestDTO.getEmail());
        member.setAge(memberRequestDTO.getAge());

        return memberRepository.save(member);
    }

    public Member update(int id, MemberRequestDTO memberRequestDTO){
        Member member = memberRepository.findById(id).orElse(null);
        if (member != null){
            member.setName(memberRequestDTO.getName());
            member.setEmail(memberRequestDTO.getEmail());
            member.setAge(memberRequestDTO.getAge());
            return memberRepository.save(member);
        }
        return null;
    }

    public List<Member> deleteById(int id){
        memberRepository.deleteById(id);
        return memberRepository.findAll();
    }
}
