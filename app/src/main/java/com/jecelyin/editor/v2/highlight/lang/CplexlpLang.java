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
public class CplexlpLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "+-/*^=<>\\";
        PROPERTY1.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "\\d+(?:\\.\\d+)?|\\d+(?:\\.\\d+)?e\\d+";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "\\";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ1.text = ">=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "=>";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "<=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "=<";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "<";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ":";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "+";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "-";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "*";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "/";
        SEQ12.TYPE = "OPERATOR";


        SEQ SEQ13 = new SEQ();
        SEQ13.text = "subject to";
        SEQ13.TYPE = "KEYWORD1";

        SEQ14.text = "such that";
        SEQ14.TYPE = "KEYWORD1";

        SEQ_REGEXP1.text = "[A-z_ ][\\w(),]+(?=:)";
        SEQ_REGEXP1.HASH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz_";
        SEQ_REGEXP1.TYPE = "LABEL";
        SEQ_REGEXP1.AT_LINE_START = "TRUE";

        SEQ_REGEXP2.text = "[A-z_][\\w!\"#$%&()/,.;?@_`'{}|~]*";
        SEQ_REGEXP2.HASH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "KEYWORD2";
        SEQ_REGEXP2.AT_LINE_START = "FALSE";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}