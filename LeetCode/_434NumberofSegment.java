
public class _434NumberofSegment {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";

        if (s.trim().isEmpty()) System.out.println(0);
        System.out.println(s.trim().split("\\s+").length);
}
}
