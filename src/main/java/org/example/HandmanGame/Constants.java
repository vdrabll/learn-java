package org.example.HandmanGame;

public class Constants {

    final static String start_message = """
           Добро пожаловать в игру Виселица! Тут я повешусь если вы не отгадаете загаданные ключевые слова из прекраного языка java :^) 
           
           *----*
               |
               |
               |
             =====
   
           Нажмите "1" что бы начать игру, что бы выйти из меню нажмите любую клавишу. 
           Удачи!
            """;
    final static String[] words = new String[]{ "abstract", "continue", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte","else" , "import" , "public","strictfp", "volatileconst", "float", "native", "super", "while" };

    final static String[] handMans = new String[]{
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
