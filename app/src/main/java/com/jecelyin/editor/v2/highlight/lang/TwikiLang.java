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
public class TwikiLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "true";
        PROPERTY1.NAME = "noTabs";

        PROPERTY2.VALUE = "soft";
        PROPERTY2.NAME = "wrap";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "html::MAIN";

        EOL_SPAN1.text = "--";
        EOL_SPAN1.TYPE = "COMMENT1";
        EOL_SPAN1.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP1.text = "-{3}[+]{1,6}(?:!!)?\\s";
        EOL_SPAN_REGEXP1.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP1.AT_LINE_START = "TRUE";
        EOL_SPAN_REGEXP1.HASH_CHAR = "---+";

        SEQ_REGEXP1.text = "\\*[^\\s*][^*]*\\*";
        SEQ_REGEXP1.TYPE = "KEYWORD4";
        SEQ_REGEXP1.AT_LINE_START = "FALSE";
        SEQ_REGEXP1.HASH_CHAR = "*";

        SEQ_REGEXP2.text = "__\\w.*?\\w__";
        SEQ_REGEXP2.TYPE = "KEYWORD4";
        SEQ_REGEXP2.AT_LINE_START = "FALSE";
        SEQ_REGEXP2.HASH_CHAR = "__";

        SEQ_REGEXP3.text = "_\\w.*?\\w_";
        SEQ_REGEXP3.TYPE = "KEYWORD4";
        SEQ_REGEXP3.AT_LINE_START = "FALSE";
        SEQ_REGEXP3.HASH_CHAR = "_";

        SEQ_REGEXP4.text = "==\\w.*?\\w==";
        SEQ_REGEXP4.TYPE = "KEYWORD4";
        SEQ_REGEXP4.AT_LINE_START = "FALSE";
        SEQ_REGEXP4.HASH_CHAR = "==";

        SEQ_REGEXP5.text = "=\\w.*?\\w=";
        SEQ_REGEXP5.TYPE = "KEYWORD4";
        SEQ_REGEXP5.AT_LINE_START = "FALSE";
        SEQ_REGEXP5.HASH_CHAR = "=";

        EOL_SPAN2.text = "---";
        EOL_SPAN2.TYPE = "KEYWORD4";
        EOL_SPAN2.AT_LINE_START = "TRUE";

        SEQ_REGEXP6.text = "[A-Z][A-Z.]*[a-z.]+(?:[A-Z][A-Z.]*[a-z.]*[a-z])+";
        SEQ_REGEXP6.HASH_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SEQ_REGEXP6.AT_WORD_START = "TRUE";
        SEQ_REGEXP6.TYPE = "KEYWORD2";

        SPAN1.TYPE = "KEYWORD3";

        BEGIN1.text = "[[";

        END1.text = "]]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";

        BEGIN2.text = "<verbatim>";

        END2.text = "</verbatim>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "<nop>";
        SEQ1.TYPE = "LITERAL2";

        SPAN3.TYPE = "LITERAL2";

        BEGIN3.text = "<noautolink>";

        END3.text = "</noautolink>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ_REGEXP SEQ_REGEXP7 = new SEQ_REGEXP();
        SEQ_REGEXP7.text = "\\s{3}\\w(?:&nbsp;|-|\\w)*?\\w+:\\s";
        SEQ_REGEXP7.TYPE = "KEYWORD2";
        SEQ_REGEXP7.AT_LINE_START = "FALSE";
        SEQ_REGEXP7.HASH_CHAR = " ";

        SEQ_REGEXP8.text = "%[A-Z]+(?:\\{[^\\}]+\\})?%";
        SEQ_REGEXP8.TYPE = "FUNCTION";
        SEQ_REGEXP8.HASH_CHAR = "%";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, SEQ_REGEXP8, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

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