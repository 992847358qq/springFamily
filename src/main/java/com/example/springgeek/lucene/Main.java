package com.example.springgeek.lucene;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String text="今天月亮非常圆,我的晚饭很香";
        StringReader sr=new StringReader(text);
         IKSegmenter ik=new IKSegmenter(sr, true);
         Lexeme lex=null;
         while((lex=ik.next())!=null){
                 System.out.print(lex.getLexemeText()+"，");
             }
    }
}
