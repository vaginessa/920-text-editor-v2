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

package com.jecelyin.editor.v2.highlight.syntax;

import com.jecelyin.editor.v2.highlight.XMLElement;

import java.util.HashMap;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */

public class KEYWORDS implements XMLElement {
    public String IGNORE_CASE;
    public SEQ[] SEQs;
    private HashMap<String, String[]> keywords;

    public HashMap<String, String[]> getKeywords() {
        return keywords;
    }

    public void add(String key, String[] val) {
        if (keywords == null) {
            keywords = new HashMap<>();
        }
        keywords.put(key, val);
    }

    @Override
    public String text() {
        return null;
    }

    public HashMap<String, String> attrs() {
        HashMap<String, String> map = new HashMap<>();
        map.put("IGNORE_CASE", IGNORE_CASE);

        return map;
    }

    @Override
    public XMLElement[][] children() {
        return new XMLElement[][] {SEQs};
    }
}