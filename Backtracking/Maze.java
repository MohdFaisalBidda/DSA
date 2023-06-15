package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        // paths("", 3, 3);
        // System.out.println(pathsRet("", 3, 3));
        // System.out.println(pathsDiagonalRet("", 3, 3));
        Boolean[][] maze ={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        pathsRestriction("", 0, 0, maze);

    }

    // Maze problem is where we have to find the number of ways to reach the target
    // location in r*c maze where we can make a move in right direction and on
    // downwards direction only

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    // Here the actual paths are printed to reach the target location in maze
    public static void paths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            paths(p + 'D', r - 1, c);
        }
        if (c > 1) {
            paths(p + 'R', r, c - 1);
        }
    }

    public static ArrayList<String> pathsRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(pathsRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathsRet(p + 'R', r, c - 1));
        }
        return ans;
    }

    public static ArrayList<String> pathsDiagonalRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans.addAll(pathsDiagonalRet(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            ans.addAll(pathsDiagonalRet(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathsDiagonalRet(p + 'H', r, c - 1));
        }
        return ans;
    }

    public static void pathsRestriction(String p, int r, int c, Boolean[][] maze) {
        if (r == maze.length - 1 && c == maze[0].length -1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if (r < maze.length - 1) {
            pathsRestriction(p + 'D', r + 1, c,maze);
        }
        if (c < maze[0].length -1) {
            pathsRestriction(p + 'R', r, c + 1,maze);
        }

    }

}
