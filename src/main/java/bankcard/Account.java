package bankcard;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return (name.length() >= 3
                && name.length() <= 19
                && containsOnlyOneSpace()
                && name.charAt(0) != ' '
                && name.charAt(name.length() - 1) != ' ');
    }

    public boolean containsOnlyOneSpace() {
        int count = 0;
        for (char ch : name.toCharArray()) {
            if (ch == ' ')
                count++;
        }
        return count == 1;
    }

}
