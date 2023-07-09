package ru.telebot.main.controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;


@Component
public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "unleashed_pepe_bot";
    }

    @Override
    public String getBotToken() {
        return "6255400328:AAFl0cjOoDB8ovp3BEeTrrgkuEQc2JKi0ZI";
    }

    @Override
    public void onUpdateReceived(Update update) {
        var originalMessage = update.getMessage();
        System.out.println(originalMessage.getText());
    }
}
