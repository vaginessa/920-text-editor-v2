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
public class CfscriptLang implements LangDefine {
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

        PROPERTY5.VALUE = "{[";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "]}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "CFDOC";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "!";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "<=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "-";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "/";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = ">";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "<";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "%";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "&";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "|";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "^";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "~";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = ".";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "}";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "{";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ",";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ";";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "]";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "[";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "?";
        SEQ24.TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = ":";
        MARK_PREVIOUS2.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS2.TYPE = "LABEL";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ25.text = ":";
        SEQ25.TYPE = "OPERATOR";


        KEYWORDS1.add("LITERAL2", new String[]{"this", "super", "false", "true", "yes", "no", });
        KEYWORDS1.add("KEYWORD1", new String[]{"break", "case", "catch", "continue", "delete", "do", "else", "exit", "finally", "for", "function", "if", "in", "new", "pageencoding", "rethrow", "return", "savecontent", "switch", "thread", "throw", "transaction", "try", "typeof", "var", "while", "with", "implements", "interface", "extends", "include", "import", "private", "protected", "public", "remote", "required", "property", });
        KEYWORDS1.add("FUNCTION", new String[]{"ACos", "ASin", "Abort", "Abs", "AddSOAPRequestHeader", "AddSOAPResponseHeader", "AjaxLink", "AjaxOnLoad", "ApplicationStop", "ArrayAppend", "ArrayAvg", "ArrayClear", "ArrayContains", "ArrayDelete", "ArrayDeleteAt", "ArrayFind", "ArrayFindNoCase", "ArrayInsertAt", "ArrayIsDefined", "ArrayIsEmpty", "ArrayLen", "ArrayMax", "ArrayMin", "ArrayNew", "ArrayPrepend", "ArrayResize", "ArraySet", "ArraySort", "ArraySum", "ArraySwap", "ArrayToList", "Asc", "Atn", "BinaryDecode", "BinaryEncode", "BitAnd", "BitMaskClear", "BitMaskRead", "BitMaskSet", "BitNot", "BitOr", "BitSHLN", "BitSHRN", "BitXor", "CJustify", "CacheGet", "CacheGetAllIds", "CacheGetMetadata", "CacheGetProperties", "CacheGetSession", "CachePut", "CacheRemove", "CacheSetProperties", "Ceiling", "CharsetDecode", "CharsetEncode", "Chr", "Compare", "CompareNoCase", "Cos", "CreateDate", "CreateDateTime", "CreateODBCDate", "CreateODBCDateTime", "CreateODBCTime", "CreateObject", "CreateTime", "CreateTimeSpan", "CreateUUID", "DE", "DateAdd", "DateCompare", "DateConvert", "DateDiff", "DateFormat", "DatePart", "Day", "DayOfWeek", "DayOfWeekAsString", "DayOfYear", "DaysInMonth", "DaysInYear", "DecimalFormat", "DecrementValue", "Decrypt", "DecryptBinary", "DeleteClientVariable", "DeserializeJSON", "DirectoryCreate", "DirectoryDelete", "DirectoryExists", "DirectoryList", "DirectoryRename", "DollarFormat", "DotNetToCFType", "Duplicate", "Encrypt", "EncryptBinary", "EntityDelete", "EntityLoad", "EntityLoadByExample", "EntityLoadByPK", "EntityMerge", "EntityNew", "EntityReload", "EntitySave", "EntitytoQuery", "Evaluate", "Exp", "ExpandPath", "FileClose", "FileCopy", "FileDelete", "FileExists", "FileIsEOF", "FileMove", "FileOpen", "FileRead", "FileReadBinary", "FileReadLine", "FileSeek", "FileSetAccessMode", "FileSetAttribute", "FileSetLastModified", "FileSkipBytes", "FileUpload", "FileUploadAll", "FileWrite", "Find", "FindNoCase", "FindOneOf", "FirstDayOfMonth", "Fix", "FormatBaseN", "GenerateSecretKey", "GetAuthUser", "GetBaseTagData", "GetBaseTagList", "GetBaseTemplatePath", "GetClientVariablesList", "GetComponentMetaData", "GetContextRoot", "GetCurrentTemplatePath", "GetDirectoryFromPath", "GetEncoding", "GetException", "GetFileFromPath", "GetFileInfo", "GetFunctionCalledName", "GetFunctionList", "GetGatewayHelper", "GetHttpRequestData", "GetHttpTimeString", "GetLocalHostIP", "GetLocale", "GetLocaleDisplayName", "GetMetaData", "GetMetricData", "GetPageContext", "GetPrinterInfo", "GetProfileSections", "GetProfileString", "GetReadableImageFormats", "GetSOAPRequest", "GetSOAPRequestHeader", "GetSOAPResponse", "GetSOAPResponseHeader", "GetTempDirectory", "GetTempFile", "GetTemplatePath", "GetTickCount", "GetTimeZoneInfo", "GetToken", "GetUserRoles", "GetWriteableImageFormats", "HTMLCodeFormat", "HTMLEditFormat", "Hash", "Hour", "IIf", "ImageAddBorder", "ImageBlur", "ImageClearRect", "ImageCopy", "ImageCrop", "ImageDrawArc", "ImageDrawBeveledRect", "ImageDrawCubicCurve", "ImageDrawLine", "ImageDrawLines", "ImageDrawOval", "ImageDrawPoint", "ImageDrawQuadraticCurve", "ImageDrawRect", "ImageDrawRoundRect", "ImageDrawText", "ImageFlip", "ImageGetBlob", "ImageGetBufferedImage", "ImageGetEXIFTag", "ImageGetHeight", "ImageGetIPTCTag", "ImageGetWidth", "ImageGrayscale", "ImageInfo", "ImageNegative", "ImageNew", "ImageOverlay", "ImagePaste", "ImageRead", "ImageReadBase64", "ImageResize", "ImageRotate", "ImageRotateDrawingAxis", "ImageScaleToFit", "ImageSetAntialiasing", "ImageSetBackgroundColor", "ImageSetDrawingColor", "ImageSetDrawingStroke", "ImageSetDrawingTransparency", "ImageSharpen", "ImageShear", "ImageShearDrawingAxis", "ImageTranslate", "ImageTranslateDrawingAxis", "ImageWrite", "ImageWriteBase64", "ImageXORDrawingMode", "IncrementValue", "InputBaseN", "Insert", "Int", "IsArray", "IsBinary", "IsBoolean", "IsCustomFunction", "IsDDX", "IsDate", "IsDebugMode", "IsDefined", "IsImage", "IsImageFile", "IsInstanceOf", "IsJSON", "IsK2ServerABroker", "IsK2ServerDocCountExceeded", "IsK2ServerOnline", "IsLeapYear", "IsLocalHost", "IsNull", "IsNumeric", "IsNumericDate", "IsObject", "IsPDFFile", "IsPDFObject", "IsQuery", "IsSOAPRequest", "IsSimpleValue", "IsStruct", "IsUserInAnyRole", "IsUserInRole", "IsUserLoggedIn", "IsValid", "IsWDDX", "IsXML", "IsXmlAttribute", "IsXmlDoc", "IsXmlElem", "IsXmlNode", "IsXmlRoot", "JSStringFormat", "JavaCast", "LCase", "LJustify", "LSCurrencyFormat", "LSDateFormat", "LSEuroCurrencyFormat", "LSIsCurrency", "LSIsDate", "LSIsNumeric", "LSNumberFormat", "LSParseCurrency", "LSParseDateTime", "LSParseEuroCurrency", "LSParseNumber", "LSTimeFormat", "LTrim", "Left", "Len", "ListAppend", "ListChangeDelims", "ListContains", "ListContainsNoCase", "ListDeleteAt", "ListFind", "ListFindNoCase", "ListFirst", "ListGetAt", "ListInsertAt", "ListLast", "ListLen", "ListPrepend", "ListQualify", "ListRest", "ListSetAt", "ListSort", "ListToArray", "ListValueCount", "ListValueCountNoCase", "Location", "Log", "Log10", "Max", "Mid", "Min", "Minute", "Month", "MonthAsString", "Now", "NumberFormat", "ORMClearSession", "ORMCloseSession", "ORMEvictCollection", "ORMEvictEntity", "ORMEvictQueries", "ORMExecuteQuery", "ORMFlush", "ORMGetSession", "ORMGetSessionFactory", "ORMReload", "ObjectEquals", "ObjectLoad", "ObjectSave", "ParagraphFormat", "ParseDateTime", "Pi", "PrecisionEvaluate", "PreserveSingleQuotes", "Quarter", "QueryAddColumn", "QueryAddRow", "QueryConvertForGrid", "QueryNew", "QuerySetCell", "QuotedValueList", "REFind", "REFindNoCase", "REMatch", "REMatchNoCase", "REReplace", "REReplaceNoCase", "RJustify", "RTrim", "Rand", "RandRange", "Randomize", "ReleaseComObject", "RemoveChars", "RepeatString", "Replace", "ReplaceList", "ReplaceNoCase", "Reverse", "Right", "Round", "Second", "SendGatewayMessage", "SerializeJSON", "SetLocale", "SetProfileString", "SetVariable", "Sgn", "Sin", "Sleep", "SpanExcluding", "SpanIncluding", "SpreadsheetAddColumn", "SpreadsheetAddFreezePane", "SpreadsheetAddImage", "SpreadsheetAddInfo", "SpreadsheetAddRow", "SpreadsheetAddRows", "SpreadsheetAddSplitPane", "SpreadsheetCreateSheet", "SpreadsheetDeleteColumn", "SpreadsheetDeleteColumns", "SpreadsheetDeleteRow", "SpreadsheetDeleteRows", "SpreadsheetFormatCell", "SpreadsheetFormatCellRange", "SpreadsheetFormatColumn", "SpreadsheetFormatColumns", "SpreadsheetFormatRow", "SpreadsheetFormatRows", "SpreadsheetGetCellComment", "SpreadsheetGetCellFormula", "SpreadsheetGetCellValue", "SpreadsheetInfo", "SpreadsheetMergeCells", "SpreadsheetNew", "SpreadsheetRead", "SpreadsheetReadBinary", "SpreadsheetRemoveSheet", "SpreadsheetSetActiveSheet", "SpreadsheetSetActiveSheetNumber", "SpreadsheetSetCellComment", "SpreadsheetSetCellFormula", "SpreadsheetSetCellValue", "SpreadsheetSetColumnWidth", "SpreadsheetSetFooter", "SpreadsheetSetHeader", "SpreadsheetSetRowHeight", "SpreadsheetShiftColumns", "SpreadsheetShiftRows", "SpreadsheetWrite", "Sqr", "StripCR", "StructAppend", "StructClear", "StructCopy", "StructCount", "StructDelete", "StructFind", "StructFindKey", "StructFindValue", "StructGet", "StructInsert", "StructIsEmpty", "StructKeyArray", "StructKeyExists", "StructKeyList", "StructNew", "StructSort", "StructUpdate", "Tan", "TimeFormat", "ToBase64", "ToBinary", "ToScript", "ToString", "Trace", "TransactionCommit", "TransactionRollback", "TransactionSetSavePoint", "Trim", "UCase", "URLDecode", "URLEncodedFormat", "URLSessionFormat", "Val", "ValueList", "VerifyClient", "Week", "Wrap", "WriteDump", "WriteLog", "WriteOutput", "XmlChildPos", "XmlElemNew", "XmlFormat", "XmlGetNodeType", "XmlNew", "XmlParse", "XmlSearch", "XmlTransform", "XmlValidate", "Year", "YesNoFormat", });
        KEYWORDS1.add("KEYWORD2", new String[]{"Variables", "Arguments", "Request", "Session", "Local", "Form", "CGI", "URL", "Attributes", "Application", "Cookie", });
        KEYWORDS1.add("KEYWORD3", new String[]{"boolean", "struct", "string", "numeric", "array", "any", "query", "mail", "void", "component", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CFDOC";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        MARK_FOLLOWING1.text = "@";
        MARK_FOLLOWING1.TYPE = "LITERAL3";


        KEYWORDS1.add("LITERAL1", new String[]{"@hint", "@displayname", "@output", "@access", "@accessors", "@returntype", "@roles", "@default", "@required", "@extends", "@implements", });
        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}