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
public class ForthLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "^:[^;]*";
        PROPERTY1.NAME = "indentNextLines";

        PROPERTY2.VALUE = "^.*;$";
        PROPERTY2.NAME = "unindentNextLines";

        PROPERTY3.VALUE = "(";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = ")";
        PROPERTY4.NAME = "commentEnd";

        PROPERTY5.VALUE = "|";
        PROPERTY5.NAME = "lineComment";

        PROPERTY6.VALUE = "+-*=><;.?/'()%,_|$";
        PROPERTY6.NAME = "noWordSep";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "|-?\\d+([./]\\d+)?";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "+-*=><;.?/'\"()%,_$";

        EOL_SPAN1.text = "|";
        EOL_SPAN1.AT_WORD_START = "TRUE";
        EOL_SPAN1.TYPE = "COMMENT1";

        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.AT_WORD_START = "TRUE";
        MARK_FOLLOWING1.TYPE = "DIGIT";

        MARK_FOLLOWING2.text = "'";
        MARK_FOLLOWING2.AT_WORD_START = "TRUE";
        MARK_FOLLOWING2.TYPE = "LITERAL3";

        SEQ_REGEXP1.text = ":\\s+(\\S+)";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.HASH_CHAR = ":";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "STACK_EFFECT";

        BEGIN1.text = "(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.AT_WORD_START = "TRUE";
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "s\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.AT_WORD_START = "TRUE";
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";

        BEGIN3.text = ".\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.AT_WORD_START = "TRUE";
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL3";

        BEGIN4.text = "f\"";

        END4.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.AT_WORD_START = "TRUE";
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL3";

        BEGIN5.text = "m\"";

        END5.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.AT_WORD_START = "TRUE";
        SPAN6.NO_LINE_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL4";

        BEGIN6.text = "\"";

        END6.text = "\"";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("MARKUP", new String[]{";", ";;", "0;", });
        KEYWORDS1.add("KEYWORD1", new String[]{"swap", "drop", "dup", "nip", "over", "rot", "-rot", "2dup", "2drop", "2over", "2swap", ">r", "r>", });
        KEYWORDS1.add("KEYWORD2", new String[]{"and", "or", "xor", ">>", "<<", "not", "+", "*", "negate", "-", "/", "mod", "/mod", "*/", "1+", "1-", "base", "hex", "decimal", "binary", "octal", });
        KEYWORDS1.add("KEYWORD3", new String[]{"@", "!", "c@", "c!", "+!", "cell+", "cells", "char+", "chars", });
        KEYWORDS1.add("KEYWORD4", new String[]{"[", "]", "create", "does>", "variable", "variable,", "literal", "last", "1,", "2,", "3,", ",", "here", "allot", "parse", "find", "compile", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STACK_EFFECT";
        RULES1.DEFAULT = "COMMENT4";

        SEQ1.text = "--";
        SEQ1.TYPE = "COMMENT3";


        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}