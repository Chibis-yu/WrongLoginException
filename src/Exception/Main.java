package Exception;


public class Main {
    //   private static final String VALIDATE_PATTERN = "[a-zA-Z0-9-_]+$";
    public static void main(String[] args) {


        check("rozaroza", "roza", "roza");
    }


    private static boolean check(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            //   } catch (WrongLoginException e) {
            //       throw new RuntimeException(e);
            //   }
            //   try {
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в логине");
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка в пароле" + e.getMessage());
        } finally {
            System.out.println("Произошла ошибка");
        }
        return false;
    }



        private static void checkLogin(String login) throws WrongLoginException {
            if (!login.matches("a-zA-Z&&0-9&&[$]")) {
          // if (!login.matches(VALIDATE_PATTERN)) {
                throw new WrongLoginException("Логин содержит неверные символы");
            } else {
                if (login.length() > 20) {

                }
                throw new WrongLoginException("Слишком длинный логин");
            }
        }
        private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
            if (!password.matches("a-zA-Z&&0-9&&[$]") && password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль неверный");
            } else {
                throw new WrongPasswordException("Попробуйте еще раз, пароль не должен быть больше 20 символов или несоответствующие символы");
            }
        }
    }




