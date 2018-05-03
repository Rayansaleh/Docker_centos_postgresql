import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        EntrepriseDAO entrepriseDAO = new EntrepriseDAO(Connect.getInstance());
        Entreprise entreprise = new Entreprise();

        //entreprise.setNom("Ebiznext");
        //entreprise.setId(1);
        //entrepriseDAO.create(entreprise);
        entrepriseDAO.find();

        SalarieDAO salarieDAO = new SalarieDAO(Connect.getInstance());
        Salarie salarie = new Salarie();

        //salarie.setNom("Rayan");
        //salarie.setId(1);
        //salarie.setId_ent(1);
        //salarieDAO.create(salarie);
        salarieDAO.find();


        /*String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous créez une entitée ou observé celle déjà existante(c/o) : ");
        while (str != "o" || str != "c") {
            str = sc.nextLine();
            System.out.println(str);
        }
            if (str == "c") {

                System.out.println("Entrer le type d'objet que vous voulez créez (entreprise/salarie) :");
                while (str != "entreprise" || str != "salarie") {
                    str = sc.nextLine();
                }

                if (str == "entreprise") {
                    System.out.println("Vous avez choisis le type entreprise.");
                    EntrepriseDAO entrepriseDAO = new EntrepriseDAO(Connect.getInstance());
                    Entreprise entreprise = new Entreprise();

                    System.out.println("Donnez un nom à l'entreprise : ");
                    str = sc.nextLine();
                    entreprise.setNom(str);

                    System.out.println("Donnez un id à l'entreprise : ");
                    str = sc.nextLine();
                    entreprise.setId(Integer.parseInt(str));

                    entrepriseDAO.create(entreprise);

                }

                if (str == "salarie") {
                    System.out.println("Vous avez choisis le type salarie.");
                    SalarieDAO salarieDAO = new SalarieDAO(Connect.getInstance());
                    Salarie salarie = new Salarie();

                    System.out.println("Donnez un nom au salarie : ");
                    str = sc.nextLine();
                    salarie.setNom(str);

                    System.out.println("Donnez un id au salarie : ");
                    str = sc.nextLine();
                    salarie.setId(Integer.parseInt(str));

                    System.out.println("Donnez l'id de l'entreprise à laquelle appartient le salarie : ");
                    str = sc.nextLine();
                    salarie.setId_ent(Integer.parseInt(str));

                    salarieDAO.create(salarie);

                }
            }

            if (str == "o"){
                EntrepriseDAO entrepriseDAO = new EntrepriseDAO(Connect.getInstance());
                SalarieDAO salarieDAO = new SalarieDAO(Connect.getInstance());

                entrepriseDAO.find();
                salarieDAO.find();
            }*/
    }
}
