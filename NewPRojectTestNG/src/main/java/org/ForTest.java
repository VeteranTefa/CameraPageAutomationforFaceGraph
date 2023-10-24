package org;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import netscape.javascript.JSObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ForTest {
    public static void main(String[] args) throws FileNotFoundException {
        JsonParser jsonParser = new JsonParser();
        FileReader fileReader= new FileReader("D:\\FaceGraphFinal\\NewPRojectTestNG\\src\\test\\JSON Folder\\data.json");
        Object obj = jsonParser.parse(fileReader);
        JsonObject jsonObject= (JsonObject) obj;
        JsonArray array=(JsonArray) jsonObject.get("dataMember");
        for (int i=0;i<array.size();i++) {
            JsonObject dataMember = (JsonObject) array.get(i);
            System.out.println(dataMember.get("firstName"));
        }
        }


    }



