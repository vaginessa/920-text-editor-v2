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
public class XqLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "(:";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = ":)";
        PROPERTY4.NAME = "commentEnd";

        PROPERTY5.VALUE = ":,+=<>/?^&*";
        PROPERTY5.NAME = "wordBreakChars";

        PROPERTY6.VALUE = "\\s*(((if)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY6.NAME = "indentNextLine";

        PROPERTY7.VALUE = "false";
        PROPERTY7.NAME = "doubleBracketIndent";

        PROPERTY8.VALUE = "true";
        PROPERTY8.NAME = "lineUpClosingBracket";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD2";
        SPAN2.DELEGATE = "ENTITY-TAGS";

        BEGIN2.text = "<!ENTITY";

        END2.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD2";
        SPAN3.DELEGATE = "CDATA";

        BEGIN3.text = "<![CDATA[";

        END3.text = "]]>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD2";
        SPAN4.DELEGATE = "DTD-TAGS";

        BEGIN4.text = "<!";

        END4.text = ">";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD3";

        BEGIN5.text = "<?";

        END5.text = ">";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.DELEGATE = "TAGS";
        SPAN_REGEXP1.HASH_CHAR = "<";


        END6.text = ">";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_WORD_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL2";

        BEGIN7.text = "&";

        END7.text = ";";


        SPAN6.BEGIN = new BEGIN[] { BEGIN7, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";
        RULES1.NO_WORD_SEP = "-_";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "/";
        SEQ1.TYPE = "MARKUP";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DTD-TAGS";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "--";

        END2.text = "--";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_WORD_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";

        BEGIN3.text = "%";

        END3.text = ";";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD2";
        SPAN6.DELEGATE = "MAIN";

        BEGIN6.text = "[";

        END6.text = "]";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "|";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "?";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "*";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ",";
        SEQ7.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ENTITY-TAGS";
        RULES1.DEFAULT = "KEYWORD2";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "--";

        END2.text = "--";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "%";
        SEQ2.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CDATA";
        RULES1.DEFAULT = "COMMENT2";

    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x\\p{XDigit}+[lL]?|\\d+(e\\d*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "(:";

        END1.text = ":)";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "$";
        MARK_FOLLOWING1.TYPE = "KEYWORD2";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ",";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "!=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ">";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ">=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "<";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "<=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = ">>";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "+";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "*";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "|";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "/";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "//";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "}";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "{";
        SEQ17.TYPE = "OPERATOR";


        KEYWORDS1.add("LITERAL2", new String[]{"ascending", "descending", "greatest", "least", "collation", "true", "false", });
        KEYWORDS1.add("KEYWORD1", new String[]{"return", "for", "in", "to", "at", "let", ":=", "where", "stable", "order", "by", "cast", "as", "if", "then", "else", });
        KEYWORDS1.add("FUNCTION", new String[]{"zero-or-one", "avg", "base-uri", "boolean", "ceiling", "codepoints-to-string", "collection", "compare", "concat", "contains", "count", "current-date", "current-dateTime", "current-time", "data", "day-from-date", "day-from-dateTime", "days-from-duration", "deep-equal", "distinct-values", "doc", "adjust-time-to-timezone", "adjust-dateTime-to-timezone", "string-length", "string-join", "string", "starts-with", "seconds-from-time", "seconds-from-duration", "seconds-from-dateTime", "round-half-to-even", "round", "root", "reverse", "replace", "remove", "prefix-from-QName", "position", "one-or-more", "number", "QName", "abs", "adjust-date-to-timezone", "doc-available", "doctype", "document", "last", "local-name", "local-name-from-QName", "lower-case", "match-all", "match-any", "matches", "max", "min", "minutes-from-dateTime", "minutes-from-duration", "minutes-from-time", "month-from-date", "month-from-dateTime", "name", "namespace-uri", "namespace-uri-for-prefix", "namespace-uri-from-QName", "node-name", "normalize-space", "lang", "item-at", "document-uri", "empty", "encode-for-uri", "ends-with", "error", "escape-html-uri", "escape-uri", "exactly-one", "exists", "false", "floor", "hours-from-dateTime", "hours-from-duration", "hours-from-time", "id", "implicit-timezone", "in-scope-prefixes", "index-of", "insert-before", "iri-to-uri", "string-pad", "string-to-codepoints", "sum", "timezone-from-date", "timezone-from-dateTime", "timezone-from-time", "not", "tokenize", "translate", "true", "unordered", "upper-case", "xcollection", "year-from-date", "year-from-dateTime", "substring-before", "subsequence", "substring", "substring-after", });
        KEYWORDS1.add("KEYWORD3", new String[]{"typeswitch", "default", "xquery", "version", "declare", "function", "library", "variable", "module", "namespace", "local", "validate", "import", "schema", "validation", "collection", "ancestor", "descendant", "self", "parent", "child", "self", "descendant-or-self", "ancestor-or-self", "preceding-sibling", "following-sibling", "following", "preceding", });
        KEYWORDS1.add("KEYWORD4", new String[]{"xs:integer", "xs:decimal", "xs:double", "xs:string", "xs:date", "xs:time", "xs:dateTime", "xs:boolean", "item", "element", "attribute", "comment", "document", "document-node", "node", "empty", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}