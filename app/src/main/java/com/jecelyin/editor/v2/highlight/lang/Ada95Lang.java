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
public class Ada95Lang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "--";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "--";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "(";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "..";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ".all";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ":=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "/=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "=>";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<>";
        SEQ9.TYPE = "NULL";

        SEQ10.text = "<<";
        SEQ10.TYPE = "LABEL";

        SEQ11.text = ">>";
        SEQ11.TYPE = "LABEL";

        SEQ12.text = ">=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "<=";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "&";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "+";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "-";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "/";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "**";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "*";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "'access";
        SEQ22.TYPE = "KEYWORD3";

        SEQ23.text = "'address";
        SEQ23.TYPE = "KEYWORD3";

        SEQ24.text = "'adjacent";
        SEQ24.TYPE = "KEYWORD3";

        SEQ25.text = "'aft";
        SEQ25.TYPE = "KEYWORD3";

        SEQ26.text = "'alignment";
        SEQ26.TYPE = "KEYWORD3";

        SEQ27.text = "'base";
        SEQ27.TYPE = "KEYWORD3";

        SEQ28.text = "'bit_order";
        SEQ28.TYPE = "KEYWORD3";

        SEQ29.text = "'body_version";
        SEQ29.TYPE = "KEYWORD3";

        SEQ30.text = "'callable";
        SEQ30.TYPE = "KEYWORD3";

        SEQ31.text = "'caller";
        SEQ31.TYPE = "KEYWORD3";

        SEQ32.text = "'ceiling";
        SEQ32.TYPE = "KEYWORD3";

        SEQ33.text = "'class";
        SEQ33.TYPE = "KEYWORD3";

        SEQ34.text = "'component_size";
        SEQ34.TYPE = "KEYWORD3";

        SEQ35.text = "'composed";
        SEQ35.TYPE = "KEYWORD3";

        SEQ36.text = "'constrained";
        SEQ36.TYPE = "KEYWORD3";

        SEQ37.text = "'copy_size";
        SEQ37.TYPE = "KEYWORD3";

        SEQ38.text = "'count";
        SEQ38.TYPE = "KEYWORD3";

        SEQ39.text = "'definite";
        SEQ39.TYPE = "KEYWORD3";

        SEQ40.text = "'delta";
        SEQ40.TYPE = "KEYWORD3";

        SEQ41.text = "'denorm";
        SEQ41.TYPE = "KEYWORD3";

        SEQ42.text = "'digits";
        SEQ42.TYPE = "KEYWORD3";

        SEQ43.text = "'exponent";
        SEQ43.TYPE = "KEYWORD3";

        SEQ44.text = "'external_tag";
        SEQ44.TYPE = "KEYWORD3";

        SEQ45.text = "'first";
        SEQ45.TYPE = "KEYWORD3";

        SEQ46.text = "'first_bit";
        SEQ46.TYPE = "KEYWORD3";

        SEQ47.text = "'floor";
        SEQ47.TYPE = "KEYWORD3";

        SEQ48.text = "'fore";
        SEQ48.TYPE = "KEYWORD3";

        SEQ49.text = "'fraction";
        SEQ49.TYPE = "KEYWORD3";

        SEQ50.text = "'genetic";
        SEQ50.TYPE = "KEYWORD3";

        SEQ51.text = "'identity";
        SEQ51.TYPE = "KEYWORD3";

        SEQ52.text = "'image";
        SEQ52.TYPE = "KEYWORD3";

        SEQ53.text = "'input";
        SEQ53.TYPE = "KEYWORD3";

        SEQ54.text = "'last";
        SEQ54.TYPE = "KEYWORD3";

        SEQ55.text = "'last_bit";
        SEQ55.TYPE = "KEYWORD3";

        SEQ56.text = "'leading_part";
        SEQ56.TYPE = "KEYWORD3";

        SEQ57.text = "'length";
        SEQ57.TYPE = "KEYWORD3";

        SEQ58.text = "'machine";
        SEQ58.TYPE = "KEYWORD3";

        SEQ59.text = "'machine_emax";
        SEQ59.TYPE = "KEYWORD3";

        SEQ60.text = "'machine_emin";
        SEQ60.TYPE = "KEYWORD3";

        SEQ61.text = "'machine_mantissa";
        SEQ61.TYPE = "KEYWORD3";

        SEQ62.text = "'machine_overflows";
        SEQ62.TYPE = "KEYWORD3";

        SEQ63.text = "'machine_radix";
        SEQ63.TYPE = "KEYWORD3";

        SEQ64.text = "'machine_rounds";
        SEQ64.TYPE = "KEYWORD3";

        SEQ65.text = "'max";
        SEQ65.TYPE = "KEYWORD3";

        SEQ66.text = "'max_size_in_storage_elements";
        SEQ66.TYPE = "KEYWORD3";

        SEQ67.text = "'min";
        SEQ67.TYPE = "KEYWORD3";

        SEQ68.text = "'model";
        SEQ68.TYPE = "KEYWORD3";

        SEQ69.text = "'model_emin";
        SEQ69.TYPE = "KEYWORD3";

        SEQ70.text = "'model_epsilon";
        SEQ70.TYPE = "KEYWORD3";

        SEQ71.text = "'model_mantissa";
        SEQ71.TYPE = "KEYWORD3";

        SEQ72.text = "'model_small";
        SEQ72.TYPE = "KEYWORD3";

        SEQ73.text = "'modulus";
        SEQ73.TYPE = "KEYWORD3";

        SEQ74.text = "'output";
        SEQ74.TYPE = "KEYWORD3";

        SEQ75.text = "'partition_id";
        SEQ75.TYPE = "KEYWORD3";

        SEQ76.text = "'pos";
        SEQ76.TYPE = "KEYWORD3";

        SEQ77.text = "'position";
        SEQ77.TYPE = "KEYWORD3";

        SEQ78.text = "'pred";
        SEQ78.TYPE = "KEYWORD3";

        SEQ79.text = "'range";
        SEQ79.TYPE = "KEYWORD3";

        SEQ80.text = "'read";
        SEQ80.TYPE = "KEYWORD3";

        SEQ81.text = "'remainder";
        SEQ81.TYPE = "KEYWORD3";

        SEQ82.text = "'round";
        SEQ82.TYPE = "KEYWORD3";

        SEQ83.text = "'rounding";
        SEQ83.TYPE = "KEYWORD3";

        SEQ84.text = "'safe_first";
        SEQ84.TYPE = "KEYWORD3";

        SEQ85.text = "'safe_last";
        SEQ85.TYPE = "KEYWORD3";

        SEQ86.text = "'scale";
        SEQ86.TYPE = "KEYWORD3";

        SEQ87.text = "'scaling";
        SEQ87.TYPE = "KEYWORD3";

        SEQ88.text = "'signed_zeros";
        SEQ88.TYPE = "KEYWORD3";

        SEQ89.text = "'size";
        SEQ89.TYPE = "KEYWORD3";

        SEQ90.text = "'small";
        SEQ90.TYPE = "KEYWORD3";

        SEQ91.text = "'storage_pool";
        SEQ91.TYPE = "KEYWORD3";

        SEQ92.text = "'storage_size";
        SEQ92.TYPE = "KEYWORD3";

        SEQ93.text = "'succ";
        SEQ93.TYPE = "KEYWORD3";

        SEQ94.text = "'tag";
        SEQ94.TYPE = "KEYWORD3";

        SEQ95.text = "'terminated";
        SEQ95.TYPE = "KEYWORD3";

        SEQ96.text = "'truncation";
        SEQ96.TYPE = "KEYWORD3";

        SEQ97.text = "'unbiased_rounding";
        SEQ97.TYPE = "KEYWORD3";

        SEQ98.text = "'unchecked_access";
        SEQ98.TYPE = "KEYWORD3";

        SEQ99.text = "'val";
        SEQ99.TYPE = "KEYWORD3";

        SEQ100.text = "'valid";
        SEQ100.TYPE = "KEYWORD3";

        SEQ101.text = "'value";
        SEQ101.TYPE = "KEYWORD3";

        SEQ102.text = "'version";
        SEQ102.TYPE = "KEYWORD3";

        SEQ103.text = "'wide_image";
        SEQ103.TYPE = "KEYWORD3";

        SEQ104.text = "'wide_value";
        SEQ104.TYPE = "KEYWORD3";

        SEQ105.text = "'wide_width";
        SEQ105.TYPE = "KEYWORD3";

        SEQ106.text = "'width";
        SEQ106.TYPE = "KEYWORD3";

        SEQ107.text = "'write";
        SEQ107.TYPE = "KEYWORD3";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("LITERAL1", new String[]{"false", "null", "true", });
        KEYWORDS1.add("KEYWORD1", new String[]{"entry", "function", "procedure", });
        KEYWORDS1.add("KEYWORD2", new String[]{"abort", "abs", "abstract", "accept", "access", "aliased", "all", "and", "array", "at", "begin", "body", "case", "constant", "declare", "delay", "delta", "digits", "do", "else", "elsif", "end", "exception", "exit", "for", "goto", "if", "in", "is", "limited", "loop", "mod", "new", "not", "or", "others", "out", "package", "pragma", "private", "protected", "raise", "range", "record", "rem", "renames", "requeue", "return", "select", "separate", "string", "subtype", "tagged", "task", "terminate", "then", "type", "until", "use", "when", "while", "with", "xor", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, SEQ42, SEQ43, SEQ44, SEQ45, SEQ46, SEQ47, SEQ48, SEQ49, SEQ50, SEQ51, SEQ52, SEQ53, SEQ54, SEQ55, SEQ56, SEQ57, SEQ58, SEQ59, SEQ60, SEQ61, SEQ62, SEQ63, SEQ64, SEQ65, SEQ66, SEQ67, SEQ68, SEQ69, SEQ70, SEQ71, SEQ72, SEQ73, SEQ74, SEQ75, SEQ76, SEQ77, SEQ78, SEQ79, SEQ80, SEQ81, SEQ82, SEQ83, SEQ84, SEQ85, SEQ86, SEQ87, SEQ88, SEQ89, SEQ90, SEQ91, SEQ92, SEQ93, SEQ94, SEQ95, SEQ96, SEQ97, SEQ98, SEQ99, SEQ100, SEQ101, SEQ102, SEQ103, SEQ104, SEQ105, SEQ106, SEQ107, };

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