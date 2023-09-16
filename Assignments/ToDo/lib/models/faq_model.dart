import 'package:flutter/material.dart';

class FAQModel {
  String question;
  String answer;

  FAQModel({
    required this.question,
    required this.answer,
  });

  static List<FAQModel> getFAQs() {
    List<FAQModel> faqs = [];

    faqs.add(
        FAQModel(
            question: 'What is the purpose of this app?',
            answer: 'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.'
        )
    );

    faqs.add(
        FAQModel(
            question: 'How do I create a new task?',
            answer: 'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.'
        )
    );

    faqs.add(
        FAQModel(
            question: 'Can I categorize my tasks?',
            answer: 'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.'
        )
    );

    faqs.add(
        FAQModel(
            question: 'How do I set reminders for my tasks?',
            answer: 'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.'
        )
    );

    faqs.add(
        FAQModel(
            question: 'Can I attach files or images to tasks?',
            answer: 'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.'
        )
    );

    return faqs;
  }
}