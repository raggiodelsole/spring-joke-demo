package com.raggiodelsole.raggiojokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
