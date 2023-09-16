import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:accordion/accordion.dart';

class FaqPage extends StatelessWidget {
  const FaqPage({super.key});

  static const headerStyle = TextStyle(
      color: Color(0xff000000), fontSize: 20, fontWeight: FontWeight.bold);
  static const contentStyle = TextStyle(
      color: Color(0xff999999), fontSize: 14, fontWeight: FontWeight.normal);


  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: appBar(),
        backgroundColor: Colors.white,
        body: ListView(
          children: [
            Positioned(
              // left: 100,
              top: 100,
              child: Padding(
                  padding: const EdgeInsets.only(left: 15),
                  child: Row(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      const Text(
                        'Help &\nSupport',
                        style: TextStyle(
                          color: Colors.black,
                          fontSize: 64,
                          fontFamily: 'Raleway',
                          fontWeight: FontWeight.w700,
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.only(top: 10, right: 20),
                        child: SvgPicture.asset(
                          'assets/icons/faq.svg',
                          width: 70,
                          height: 70,
                        ),
                      ),
                    ],
                  )
              ),
            ),


            Accordion(
              children: [
                AccordionSection(
                  rightIcon: const Icon(
                    Icons.keyboard_arrow_down,
                    color: Colors.black26,
                    size: 30,
                  ),
                  isOpen: false,
                  headerBackgroundColor: Colors.transparent,
                  headerPadding: const EdgeInsets.only(left: 10, top: 20),
                  paddingBetweenClosedSections: 20,
                  contentVerticalPadding: 20,
                  contentBorderWidth: 0,
                  contentBorderColor: Colors.transparent,
                  header: const Text(
                      '1. What is the purpose of this app?',
                      style: headerStyle
                  ),
                  content: const Text(
                      'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.',
                      style: contentStyle
                  ),
                ),

                AccordionSection(
                  rightIcon: const Icon(
                    Icons.keyboard_arrow_down,
                    color: Colors.black26,
                    size: 30,
                  ),
                  isOpen: false,
                  headerBackgroundColor: Colors.transparent,
                  headerPadding: const EdgeInsets.only(left: 10),
                  paddingBetweenClosedSections: 20,
                  contentVerticalPadding: 20,
                  contentBorderWidth: 0,
                  contentBorderColor: Colors.transparent,
                  header: const Text(
                      '2. How do I create a new task?',
                      style: headerStyle
                  ),
                  content: const Text(
                      'You can create a task using + icon in the bottom of the home.',
                      style: contentStyle
                  ),
                ),

                AccordionSection(
                  rightIcon: const Icon(
                    Icons.keyboard_arrow_down,
                    color: Colors.black26,
                    size: 30,
                  ),
                  isOpen: false,
                  headerBackgroundColor: Colors.transparent,
                  headerPadding: const EdgeInsets.only(left: 10),
                  paddingBetweenClosedSections: 20,
                  contentVerticalPadding: 20,
                  contentBorderWidth: 0,
                  contentBorderColor: Colors.transparent,
                  header: const Text(
                      '3. Can I categorize my tasks?',
                      style: headerStyle
                  ),
                  content: const Text(
                      'Yes, You can categorize your task using "Select Category" dropdown menu.',
                      style: contentStyle
                  ),
                ),

                AccordionSection(
                  rightIcon: const Icon(
                    Icons.keyboard_arrow_down,
                    color: Colors.black26,
                    size: 30,
                  ),
                  isOpen: false,
                  headerBackgroundColor: Colors.transparent,
                  headerPadding: const EdgeInsets.only(left: 10),
                  paddingBetweenClosedSections: 20,
                  contentVerticalPadding: 20,
                  contentBorderWidth: 0,
                  contentBorderColor: Colors.transparent,
                  header: const Text(
                      '4. How do I set reminders for my tasks?',
                      style: headerStyle
                  ),
                  content: const Text(
                      'This app is designed to help users efficiently manage and organize their tasks, ensuring they stay on top of their to-do lists and priorities.',
                      style: contentStyle
                  ),
                ),

                AccordionSection(
                  rightIcon: const Icon(
                    Icons.keyboard_arrow_down,
                    color: Colors.black26,
                    size: 30,
                  ),
                  isOpen: false,
                  headerBackgroundColor: Colors.transparent,
                  headerPadding: const EdgeInsets.only(left: 10),
                  paddingBetweenClosedSections: 20,
                  contentVerticalPadding: 20,
                  contentBorderWidth: 0,
                  contentBorderColor: Colors.transparent,
                  header: const Text(
                      '5. Can I attach files or images to tasks?',
                      style: headerStyle
                  ),
                  content: const Text(
                      'Yes, You can attach files to your tasks.',
                      style: contentStyle
                  ),
                ),
              ],
            ),
          ],
        )
    );
  }

  AppBar appBar() {
    return AppBar(
      backgroundColor: Colors.white,
      elevation: 0.0,
      leading: GestureDetector(
        onTap: () {

        },
        child: Container(
          alignment: Alignment.center,
          child: SvgPicture.asset(
            'assets/icons/Arrow - Left 2.svg',
            height: 40,
            width: 40,
          ),
        ),
      ),
    );
  }
}
