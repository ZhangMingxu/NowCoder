package com.zhangmingxu.huawei;

import java.util.*;

/**
 * Created by 张明旭 on 2017/5/16.
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * 处理:
 * 1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
 * 2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
 * 3.输入的文件可能带路径，记录文件名称不能带路径
 * <p>
 * 输入描述:
 * 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 * <p>
 * 文件路径为windows格式
 * <p>
 * 如：E:\V1R2\product\fpgadrive.c 1325
 * <p>
 * <p>
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1
 * <p>
 * 结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。
 * <p>
 * 如果超过8条记录，则只输出前8条记录.
 * <p>
 * 如果文件名的长度超过16个字符，则只输出后16个字符
 * <p>
 * 输入例子:
 * E:\V1R2\product\fpgadrive.c 1325
 */
public class JianDanDeCuoWuJiLu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        Map<String, Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            String string = scanner.next();
            String[]strings = string.split(" ");
            int no = strings[0].lastIndexOf("\\");
            string = no < 0 ? strings[0] : strings[0].substring(no + 1);
            int linenum = Integer.parseInt(strings[1]);
            String data = string+" "+linenum;
            if (map.keySet().contains(data)){
                map.put(data,map.get(data)+1);
            }else {
                map.put(data,1);
            }
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>();
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                return(arg1.getValue()-arg0.getValue()) == 0? (arg0.getValue()-arg1.getValue()) : (arg1.getValue()-arg0.getValue());
            }
        });
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            String [] strings = list.get(i).getKey().split(" ");
            String k = strings[0].length()>16?strings[0].substring(strings[0].length()-16):strings[0];
            result+=(k+" "+strings[1]+" "+list.get(i).getValue());
        }
        System.out.print(result+"\n");

    }
    /*public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap而不是hashmap！！！！！
        String key;
        String filename;
        String path;
        while (in.hasNext()) {
            path = in.next();
            //将路径转换为文件名
            int id = path.lastIndexOf('\\');
            //如果找不到说明只有文件名没有路径
            filename = id < 0 ? path : path.substring(id + 1);
            int linenum = in.nextInt();
            //统计频率
            key = filename + " " + linenum;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        in.close();

        //对记录进行排序
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            //降序
            @Override
            public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                return (arg1.getValue() - arg0.getValue()) == 0 ? (arg0.getValue() - arg1.getValue()) : (arg1.getValue() - arg0.getValue());
            }
        });
//只输出前8条
        int m = 0;
        for (Map.Entry<String, Integer> mapping : list) {
            m++;
            if (m <= 8) {
                String[] str = mapping.getKey().split(" ");
                String k = str[0].length() > 16 ? str[0].substring(str[0].length() - 16) : str[0];
                String n = str[1];
                System.out.println(k + " " + n + " " + mapping.getValue());
            } else {
                break;
            }

        }
    }*/
}

