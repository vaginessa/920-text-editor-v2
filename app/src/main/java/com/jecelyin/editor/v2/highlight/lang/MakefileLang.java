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
public class MakefileLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN_REGEXP1.TYPE = "FUNCTION";
        SPAN_REGEXP1.DELEGATE = "MAIN";
        SPAN_REGEXP1.HASH_CHAR = "$";

        BEGIN1.text = "\\$\\([a-zA-Z][\\w-]*";

        END1.text = ")";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN1 = new SPAN();
        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "VARIABLE";

        BEGIN2.text = "$(";

        END2.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "VARIABLE";

        BEGIN3.text = "${";

        END3.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";
        SPAN5.ESCAPE = "\\";

        BEGIN6.text = "`";

        END6.text = "`";


        SPAN5.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ":=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "+=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "?=";
        SEQ4.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";


        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VARIABLE";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.ESCAPE = "\\";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "VARIABLE";

        BEGIN1.text = "$(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "VARIABLE";

        BEGIN2.text = "${";

        END2.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}