package org.example.HandmanGame;

public class Constants {

    final static String startMessage = """
           Добро пожаловать в игру Виселица!
           Тут я повешусь если вы не отгадаете загаданные ключевые слова из прекраного языка java :^)\s
           
           *----*
               |
               |
               |
             =====
   
           Введите цифру "1" что бы начать игру, что бы выйти из меню введите любую клавишу.\s
           Удачи!
            """;

    final static String startGameMassage = "Мы загадали слово, введите предпологаемую букву (только английские буквы):";
    final static String mistakes = "Ошибок: %s";
    final static String winMassage = "Вы угадали \uD83C\uDFC6 это было слово %s. \n";
    final static String badEndMassage = "Вы не угадали слово %s и меня уволили с работы, штош, пора создавать резюме снова :(\n" +
            " Попробуйте еще раз \n";
    final static String[] words = new String[]{ "abstract", "continue", "switch", "assert", "default", "goto",
                                                "package", "synchronized", "boolean", "do", "if",
                                                "private", "this", "break", "double",
                                                "implements", "protected", "throw", "byte","else" ,
                                                "import" , "public","strictfp", "volatileconst",
                                                "float", "native", "super", "while" };

    final static String[] gallows = new String[]{
           """
          
          *----*
               |
               |
               |
             =====
            """,
            """ 
            
            *----*
            O    |
                 |
                 |
               =====
           """,
            """ 
               
               *----*
                O   |
                |   |
                    |
                 =====
           """,
            """
            
            *----*
            O    |
           /|    |
                 |
               =====
           """,
            """
            
            *----*
             O   |
            /|\\  |
                 |
               =====
           """,
            """ 
          
          *----*
         O     |
        /|\\    |
         |     |
            =====
           """, """
            
            *----*
             O   |
            /|\\  |
            /    |
              =====
            """,
            """
                    
            *----*
             O   |
            /|\\  |
            / \\  |
                ====
            """,
            """
            
            *----*
            [O   |
            /|\\  |
            / \\  |
                ====
            """,
            """
            
            *----*
            [O]  |
            /|\\  |
            / \\  |
                ====
            """
    };



}
