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
public class IdlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "/*";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = "*/";
        PROPERTY4.NAME = "commentEnd";

        PROPERTY5.VALUE = "*";
        PROPERTY5.NAME = "boxComment";

        PROPERTY6.VALUE = "//";
        PROPERTY6.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "KEYWORD2";
        EOL_SPAN1.DELEGATE = "PREPROCESSOR";

        IMPORT1.DELEGATE = "LEX";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LEX";
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "c::COMMENTS";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SEQ1.text = "}";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "{";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ":";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "=";
        SEQ6.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ7.text = ")";
        SEQ7.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"attribute", "case", "const", "context", "default", "exception", "fixed", "in", "inout", "interface", "module", "oneway", "out", "raises", "readonly", "switch", });
        KEYWORDS1.add("KEYWORD3", new String[]{"any", "boolean", "char", "double", "enum", "float", "long", "Object", "octet", "sequence", "short", "string", "struct", "typedef", "unsigned", "union", "void", "wchar", "wstring", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "PREPROCESSOR";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN_REGEXP1.text = "include\\b";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "INCLUDE";
        EOL_SPAN_REGEXP1.HASH_CHAR = "include";

        EOL_SPAN_REGEXP2.text = "define\\b";
        EOL_SPAN_REGEXP2.TYPE = "MARKUP";
        EOL_SPAN_REGEXP2.DELEGATE = "DEFINE";
        EOL_SPAN_REGEXP2.HASH_CHAR = "define";

        EOL_SPAN_REGEXP3.text = "endif\\b";
        EOL_SPAN_REGEXP3.TYPE = "MARKUP";
        EOL_SPAN_REGEXP3.DELEGATE = "LEX";
        EOL_SPAN_REGEXP3.HASH_CHAR = "endif";

        EOL_SPAN_REGEXP4.text = "elif\\b";
        EOL_SPAN_REGEXP4.TYPE = "MARKUP";
        EOL_SPAN_REGEXP4.DELEGATE = "c::CONDITION";
        EOL_SPAN_REGEXP4.HASH_CHAR = "elif";

        EOL_SPAN_REGEXP5.text = "if\\b";
        EOL_SPAN_REGEXP5.TYPE = "MARKUP";
        EOL_SPAN_REGEXP5.DELEGATE = "c::CONDITION";
        EOL_SPAN_REGEXP5.HASH_CHAR = "if";

        IMPORT1.DELEGATE = "LEX";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, EOL_SPAN_REGEXP3, EOL_SPAN_REGEXP4, EOL_SPAN_REGEXP5, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INCLUDE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "<";

        END1.text = ">";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "LEX";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DEFINE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "#";
        SEQ1.TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "LEX";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}