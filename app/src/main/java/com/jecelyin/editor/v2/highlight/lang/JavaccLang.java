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
public class JavaccLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "{";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s+|else$|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "java::MAIN";

        SEQ_REGEXP1.text = "<[[:space:]]*\\w+[[:space:]]*[:]";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "<";

        SEQ_REGEXP2.text = "<[[:space:]]*\\w+([[:space:]]*[,][[:space:]]*\\w+[[:space:]]*)*[[:space:]]*>";
        SEQ_REGEXP2.TYPE = "KEYWORD2";
        SEQ_REGEXP2.HASH_CHAR = "<";

        SEQ_REGEXP3.text = "[#]\\w+[:]";
        SEQ_REGEXP3.TYPE = "KEYWORD2";
        SEQ_REGEXP3.HASH_CHAR = "#";


        KEYWORDS1.add("KEYWORD2", new String[]{"DEFAULT", });
        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, };

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