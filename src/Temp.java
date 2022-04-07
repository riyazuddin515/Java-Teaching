//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Temp {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            String s = sc.next();
//            if (n < 10) {
//                System.out.println("NO");
//                continue;
//            }
//            if (solve(0, n, s, "", new HashMap<>())) {
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }
//    }
//
//    private static boolean solve(int i, int n, String s, String ansf, HashMap<String, Boolean> hashMap) {
//        if (i == n) {
//            if (ansf.length() < 10) {
//                return false;
//            } else {
//                return ansf.startsWith("91") || ansf.startsWith("19");
//            }
//        }
//        if (hashMap.containsKey(ansf) && hashMap.get(ansf))
//            return true;
//        boolean notPick = solve(i + 1, n, s, ansf, hashMap);
//        boolean pick = solve(i + 1, n, s, ansf + s.charAt(i), hashMap);
//        if (pick || notPick) {
//            hashMap.put(ansf, true);
//            return true;
//        }
//        return false;
//    }
//
//    private static boolean tabulation(int n, String s) {
//        HashMap<String, Boolean> hashMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            boolean notPick = solve(i + 1, n, s, ansf, hashMap);
//            boolean pick = solve(i + 1, n, s, ansf + s.charAt(i), hashMap);
//            if (pick || notPick) {
//                hashMap.put(ansf, true);
//                return true;
//            }
//        }
//    }
//
//    private static boolean solve1(int i, String s, HashMap<String, Boolean> hashMap) {
//        if (s.length() < 10 || i == s.length())
//            return false;
//        if (s.length() == 10) {
//            return s.startsWith("91") || s.startsWith("19");
//        }
//        if (hashMap.containsKey(s) && hashMap.get(s))
//            return true;
//        boolean notPick = false;
//        if (i + 1 < s.length())
//            notPick = solve1(0, s.substring(0, i) + s.substring(i + 1), hashMap);
//        boolean pick = solve1(i + 1, s, hashMap);
//        if (pick || notPick) {
//            hashMap.put(s, true);
//            return true;
//        }
//        return false;
//    }
//
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int q = sc.nextInt();
////        int[] arr = new int[n];
////        for (int i = 0; i < n; i++) {
////            arr[i] = sc.nextInt();
////        }
////        for (int i = 0; i < q; i++) {
////            int l = sc.nextInt();
////            int r = sc.nextInt();
////            System.out.println(solve(arr, l, r));
////        }
////        sc.close();
////    }
////
////    private static int solve(int[] arr, int l, int r) {
////        int result = arr[l - 1];
////        for (int i = l; i < r; i++) {
////            result = result ^ arr[i];
////        }
////        if (result % 2 == 1) {
////            return 1;
////        }
////        return 0;
////    }
//}
