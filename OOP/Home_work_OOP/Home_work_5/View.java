package OOP.OOP_Homework.OOP_05;

import java.util.Scanner;
import java.util.UUID;

public class View {
        private final Scanner scanner;
        private GroupPresenter groupPresenter;
        private StudentPresenter studentPresenter;

        public View() {
            this.scanner = new Scanner(System.in);
        }

        public void setGroupPresenter(GroupPresenter groupPresenter) {
            this.groupPresenter = groupPresenter;
        }

        public void setStudentPresenter(StudentPresenter studentPresenter) {
            this.studentPresenter = studentPresenter;
        }

        public void start() {
            while (true) {
                System.out.println("""
                        Введите номер команды:
                        1 - создать группу
                        2 - просмотреть все группы
                        3 - создать студента в группе
                        4 - просмотреть всех студентов одной группы
                        5 - завершить программу
                    """);
                String command = scanner.nextLine();

                switch (command) {
                    case "1":
                        System.out.print("Введите номер для группы: ");
                        Integer number = Integer.valueOf(scanner.nextLine());
                        groupPresenter.create(number);
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Список всех групп:");
                        for (Group group : groupPresenter.getAll()) {
                            System.out.println(group);
                        }
                        System.out.println();
                        break;
                    case "3":
                        System.out.print("Введите номер группы, в которую будете добавлять студента: ");
                        number = Integer.valueOf(scanner.nextLine());
                        if (groupPresenter.getByNumber(number) != null) {
                            System.out.print("Введите имя студента: ");
                            String name = scanner.nextLine();
                            studentPresenter.create(name, groupPresenter.getId(number));
                        } else {
                            System.err.println("Такой группы нет! Повторите попытку!");
                        }
                        System.out.println();
                        break;
                    case "4":
                        System.out.print("Введите номер группы, студентов которой нужно показать: ");
                        number = Integer.valueOf(scanner.nextLine());
                        if (groupPresenter.getByNumber(number) != null) {
                            for (Student student : studentPresenter.getAllByGroup(groupPresenter.getId(number))) {
                                System.out.println(student);
                            }
                        } else {
                            System.err.println("Группы с таким номером не существует! Повторите попытку!");
                        }
                        System.out.println();
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Такой команды нет! Введите заново!\n");
                        break;
                }
            }
        }
    }
