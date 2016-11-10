/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;
import com.jecelyin.editor.v2.highlight.syntax.*;
/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class GroovyLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "{";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "}";
        PROPERTY5.NAME = "indentCloseBrackets";

        PROPERTY6.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY6.NAME = "indentNextLine";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "GROOVYDOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "LITERAL";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.TYPE = "LITERAL1";
        SPAN_REGEXP1.DELEGATE = "LITERAL";
        SPAN_REGEXP1.HASH_CHAR = "<<<";


        END5.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN5, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "=~";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "|";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "!";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "<=>";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ">=";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "<=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "+";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "->";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "-";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "?";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "&";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ".*";
        SEQ14.TYPE = "NULL";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT1";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ15.text = ")";
        SEQ15.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"abstract", "break", "case", "catch", "continue", "default", "do", "else", "extends", "final", "finally", "for", "if", "implements", "instanceof", "native", "new", "private", "protected", "public", "return", "static", "switch", "synchronized", "throw", "throws", "transient", "try", "volatile", "while", "strictfp", "package", "import", });
        KEYWORDS1.add("INVALID", new String[]{"goto", "const", });
        KEYWORDS1.add("KEYWORD2", new String[]{"as", "assert", "def", "mixin", "property", "test", "using", "in", });
        KEYWORDS1.add("LITERAL3", new String[]{"it", });
        KEYWORDS1.add("KEYWORD3", new String[]{"boolean", "byte", "char", "class", "double", "float", "int", "interface", "long", "short", "void", });
        KEYWORDS1.add("KEYWORD4", new String[]{"abs", "any", "append", "asList", "asWritable", "call", "collect", "compareTo", "count", "div", "dump", "each", "eachByte", "eachFile", "eachLine", "every", "find", "findAll", "flatten", "getAt", "getErr", "getIn", "getOut", "getText", "grep", "immutable", "inject", "inspect", "intersect", "invokeMethods", "isCase", "join", "leftShift", "minus", "multiply", "newInputStream", "newOutputStream", "newPrintWriter", "newReader", "newWriter", "next", "plus", "pop", "power", "previous", "print", "println", "push", "putAt", "read", "readBytes", "readLines", "reverse", "reverseEach", "round", "size", "sort", "splitEachLine", "step", "subMap", "times", "toInteger", "toList", "tokenize", "upto", "waitForOrKill", "withPrintWriter", "withReader", "withStream", "withWriter", "withWriterAppend", "write", "writeLine", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "GROOVYDOC";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = "{";
        SEQ1.TYPE = "COMMENT3";

        SEQ2.text = "*";
        SEQ2.TYPE = "COMMENT3";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ3 = new SEQ();
        SEQ3.text = "<<";
        SEQ3.TYPE = "COMMENT3";

        SEQ4.text = "<=";
        SEQ4.TYPE = "COMMENT3";

        SEQ5.text = "<";
        SEQ5.TYPE = "COMMENT3";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "xml::TAGS";

        BEGIN2.text = "<";

        END2.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "LABEL";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}