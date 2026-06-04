package com.elementaryrecap.dto;

public record AnswerResult(Long questionId, String selectedAnswer, String correctAnswer, boolean correct, String hint) {}
