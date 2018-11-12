package com.javiles.brightbox.controllers;

import com.javiles.brightbox.models.Phrase;
import com.javiles.brightbox.repositories.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController
{
    @Autowired
    PhraseRepository phraseRepository;

    @RequestMapping("/phrase")
    public Phrase getPhrase()
    {
        return phraseRepository.generatePhrase();
    }
}
