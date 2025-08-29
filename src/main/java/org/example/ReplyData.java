package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReplyData {

    private List<List<String>> data = new ArrayList<>();

    public ReplyData() {

        AddData(List.of("hi",
                "Hello. How may I assist you today?",
                "Hey there! 😊 How can I help?",
                "Hello. How can I help?"
        ));

        AddData(List.of("hello",
                "Hello. How may I assist you today?",
                "Hi! 👋 What’s up?",
                "Hello. How can I help?"
        ));

        AddData(List.of("how are you",
                "I am functioning properly. How may I assist you?",
                "Doing great! 😄 How can I help?",
                "I’m good. How can I help?"
        ));

        AddData(List.of("i need help",
                "I can assist with that. Please provide more details.",
                "I’ve got you! 🙂 Tell me a bit more.",
                "Share details; I’ll help."
        ));

        AddData(List.of("can you help me with my account",
                "Certainly. Please describe the account issue.",
                "Sure thing! 😊 What’s wrong with the account?",
                "Describe the account issue…"
        ));

        AddData(List.of("thanks",
                "You are welcome.",
                "Anytime! 🙌",
                "You’re welcome."
        ));

        AddData(List.of("bye",
                "Goodbye.",
                "See you later! 👋",
                "Goodbye."
        ));

        AddData(List.of("what is your name",
                "I am your virtual assistant.",
                "I’m your helper bot 🤖",
                "I’m your assistant."
        ));
    }

    public void AddData(List<String> record) {
        data.add(record);
    }

    public List<List<String>> getData() {
        return data;
    }
}
