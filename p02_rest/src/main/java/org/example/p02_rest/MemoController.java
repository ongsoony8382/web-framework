package org.example.p02_rest;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/memo")
class MemoController {
    private final MemoRepository memoRepository;

    MemoController(MemoRepository memoRepository) { // 생성자 방식으로 repository 주입
        this.memoRepository = memoRepository;
    }

    @GetMapping
    public List<Memo> findAll() {
        return memoRepository.findAllByOrderByWriterAsc();
    }

    @GetMapping("/{id}")
    public Memo findById(@PathVariable int id) {
        return memoRepository.findById(id).orElse(null);
    }

    @PostMapping
    ResponseEntity<Memo> save(@RequestBody MemoDTO dto) {
        Memo memo = new Memo();
        memo.setDate(Instant.now());
        memo = memoRepository.save(memo);
        return ResponseEntity.ok(memo);
    }

    @PutMapping("/{id}")
    ResponseEntity<Memo> update(@PathVariable int id, @Valid @RequestBody MemoDTO dto) {
        Memo memo = memoRepository.findById(id).orElse(null);
        memo.setBody(dto.body());
        memo.setWriter(dto.writer());
        memo.setDate(Instant.now());
        memo = memoRepository.save(memo);
        return ResponseEntity.ok(memo);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {memoRepository.deleteById(id);}
}
