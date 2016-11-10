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
public class LotosLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "(*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*)";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "\\s*(let|library|process|specification|type|>>).*|\\s*(\\(|\\[\\]|\\[>|\\|\\||\\|\\|\\||\\|\\[.*\\]\\||\\[.*\\]\\s*->)\\s*";
        PROPERTY3.NAME = "indentNextLines";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "(*";

        END1.text = "*)";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ">>";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "[>";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "|||";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "||";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "|[";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "]|";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "[]";
        SEQ7.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"accept", "actualizedby", "any", "behavior", "behaviour", "choice", "endlib", "endproc", "endspec", "endtype", "eqns", "exit", "for", "forall", "formaleqns", "formalopns", "formalsorts", "hide", "i", "in", "is", "let", "library", "noexit", "of", "ofsort", "opnnames", "opns", "par", "process", "renamedby", "sortnames", "sorts", "specification", "stop", "type", "using", "where", });
        KEYWORDS1.add("KEYWORD2", new String[]{"Bit", "BitString", "Bool", "DecDigit", "DecString", "Element", "FBool", "HexDigit", "HexString", "OctDigit", "Octet", "OctString", "Nat", "NonEmptyString", "OctetString", "Set", "String", "BasicNaturalNumber", "BasicNonEmptyString", "BitNatRepr", "Boolean", "FBoolean", "DecNatRepr", "HexNatRepr", "NatRepresentations", "NaturalNumber", "OctNatRepr", "RicherNonEmptyString", "String0", "String1", });
        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

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