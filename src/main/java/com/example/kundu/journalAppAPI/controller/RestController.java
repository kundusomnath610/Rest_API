package com.example.kundu.journalAppAPI.controller;


import com.example.kundu.journalAppAPI.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
