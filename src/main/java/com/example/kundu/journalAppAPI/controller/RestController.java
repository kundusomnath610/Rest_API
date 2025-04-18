package com.example.kundu.journalAppAPI.controller;


import com.example.kundu.journalAppAPI.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/journal")
public class RestController {

    private Map <Long, JournalEntry> journalentries = new HashMap<>();

    @GetMapping("/entry")
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalentries.values());
    }
    

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalentries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalById(@PathVariable Long myId) {
        return journalentries.get(myId);
    }

}
