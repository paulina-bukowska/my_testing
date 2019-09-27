package com.example.devskiller;

import java.util.HashMap;
import java.util.Map;

// Method decodes a `String` to a corresponding `Map`.
// The `String` is composed of key-value pairs. Key is separated from value with an 'equals' character (`=`).
// Pairs are separated with an 'ampersand' character (`&`).
// Empty keys and values are allowed, but the equals sign must be present (e.g. `"=value"`, `"key="`).
// If the key or value is empty, empty `String` should be returned.
// If the given `String` is empty, an empty `Map` should be returned.
// If the given `String` is null, `null` should be returned.
// If the given `String` has an invalid format, an `IllegalArgumentException` should be thrown.

public class MapDecoder {
    public Map<String, String> decode(String s) {
        Map<String, String> decodedInfo = new HashMap<>();

        if (s.isEmpty()) {
            return decodedInfo;
        }
        if (s == null) {
            return null;
        }

        try {
            String newS = s.replace("=", "&");
            String[] splitS = newS.split("&");

            if (splitS.length % 2 == 0) {
                for (int i = 0; i < splitS.length; i = i + 2) {
                    decodedInfo.put(splitS[i], splitS[i + 1]);
                }
            } else {
                for (int i = 0; i < splitS.length - 1; i = i + 2) {
                    decodedInfo.put(splitS[i], splitS[i + 1]);
                }
                decodedInfo.put(splitS[splitS.length - 1], "");
            }
        } catch (IllegalArgumentException e) {
            new IllegalArgumentException();
        }
        return decodedInfo;
    }
}
