//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public void fall(){
    int day = 3;
    String dayType;
    switch (day) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Hétköznap";
            break;
        case 6:
        case 7:
            dayType = "Hétvége";
            break;
        default:
            dayType = "Ismeretlen";
    }
}


public void JobbFall(){
    int day = 3;

    String dayType = switch (day) {
     case 1, 2, 3, 4, 5 -> "Hétköznap";
     case 6, 7 -> "Hétvége";
     default -> "Ismeretlen";
    };
}

public void Szamolas(){
    int score = 85;

    String grade = switch (score) {
     case 100, 90 -> {
            System.out.println("Kiváló teljesítmény!");
            yield "A";
     }
     case 80 -> {
            System.out.println("Szép munka!");
            yield "B";
     }
     default -> {
            System.out.println("Fejlődés szükséges.");
            yield "C";
     }
    };

    System.out.println(grade);
}


public void Pattern(){
    Object obj = "Hello World";

    String result = switch (obj) {
     case Integer i -> "Ez egy egész szám: " + i;
     case String s -> "Ez egy szöveg, hossza: " + s.length();
     case null -> "A objektum null";
     default -> "Ismeretlen típus";
    };
}

void main() {
    Szamolas();
}
