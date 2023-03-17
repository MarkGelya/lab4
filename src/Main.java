import java.util.ArrayList;

import Persons.*;
import Things.*;
import Skills.*;
import BookScripts.*;

public class Main {
    public static void main(String[] args) {
        Person neznaika = new Person("Незнайка");
        Clothes rubashka1 = new Clothes("Рубашка");
        Person korotishka1 = new Person("Коротышка1", new Item[] {rubashka1});
        Person korotishka2 = new Person("Коротышка2", new Item[] {new Clothes("Рубашка")});
        Person korotishka3 = new Person("Коротышка3", new Item[] {new Clothes("Рубашка")});
        Person korotishka4 = new Person("Коротышка4");
        Person strizhenij = new Person("Стриженый");
        Person vichrastij = new Person("Вихрастый");
        Location room = new Location("Комната");

        // Посреди каталажки стояла чугунная печь, от которой через все помещение тянулись длинные жестяные трубы.
        class Stove extends AbsThing implements Cookable {
            private IFood food;
            public Stove() {
                super("Чугунная печь");
                super.setPosition(Position.CENTER);
            }
            public void setPosition(Position pos) {
                this.setPosition(pos);
            }
            public Position getPosition() {
                return this.getPosition();
            }
            public String getName() {
                return name;
            }
            public void cook(IFood food) {
                this.food = food;
            }
            public boolean isEmpty() {
                return (food == null);
            }
            public IFood extract() throws ContainerIsEmpty {
                if (this.isEmpty()) {
                    throw new ContainerIsEmpty(this);
                }
                class PreparedFood extends Food {
                    public int degree_of_roast = 0;
                    PreparedFood(String name, int foodScore) {
                        super(name, foodScore);
                    }
                }
                if (food instanceof PreparedFood) {
                    ((PreparedFood)food).degree_of_roast += 1;
                    ((PreparedFood)food).addFoodScore(3);
                    if (((PreparedFood)food).degree_of_roast == 3) {
                        this.food = null;
                    }
                }
                return this.food;
            }
        }
        Stove stove = new Stove();
        // Вокруг печки сидели несколько коротышек и пекли в горячей золе картошку.
        IFood potato = new Food("Картошка", 5);
        korotishka1.useSkill(new CookSkill(stove, potato));
        // Время от времени кто-нибудь из них открывал чугунную дверцу, вытаскивал из золы испеченную картошку и начинал усиленно дуть на нее, перебрасывая с руки на руку, чтоб поскорей остудить.
        korotishka2.useSkill(new ExtractSkill(stove));
        korotishka2.useSkill(new BlowSkill(potato));
        // // Другие коротышки сидели на полках или попросту на полу и занимались каждый своим делом: кто, вооружившись иглой, штопал свою ветхую одежонку, кто играл с приятелями в расшибалочку или рассказывал желавшим послушать какую-нибудь грустную историю из своей жизни.
        Sitable polka = new Sitable() {
            private String name = "Полка";
            private final int size = 5;
            private int count = 0;
            public boolean isFree() {
                return (count < size);
            }
            public void SitDown(AbsPerson person) {
                count++;
            }
            public void SitUp(AbsPerson person) {
                count--;
            }
            public String getName() { return name; }
        };
        korotishka1.useSkill(new SitDownSkill(polka));
        korotishka2.useSkill(new SitDownSkill(polka));
        korotishka3.useSkill(new SitDownSkill(polka));
        korotishka1.useSkill(new RepairSkill(rubashka1));

        Game gameRashibolochka = new Game() {
            private String name = "Расшибалочку";
            private ArrayList<AbsPerson> players = new ArrayList<AbsPerson>();

            public String getName() {
                return name;
            }
            public void addPlayer(AbsPerson player) {
                this.players.add(player);
            }
            public void start() {
                System.out.printf("Играют в расшибалочку\n");
            }
        };
        gameRashibolochka.addPlayer(korotishka2);
        gameRashibolochka.addPlayer(korotishka3);
        gameRashibolochka.start();
        korotishka4.useSkill(new SaySkill("...грустная история..."));
        // // Помещение было без окон и освещалось одной-единственной электрической лампочкой, висевшей высоко под потолком.
        // // Лампочка была тусклая и светила, как говорится, только себе под нос.
        room.things.add(new Lamp(40));
        // // Как только Незнайка попал в каталажку и дверь за ним захлопнулась, он принялся протирать руками глаза, пытаясь хоть что-нибудь разглядеть в полутьме. Толку из этого вышло мало: он лишь размазал по лицу черную краску, которой были испачканы его руки.
        neznaika.setStatus(Status.DIRTY_HANDS);
        // // Увидев новоприбывшего,  соскочили со своих полок и подбежали к нему.
        Group korotishki = new Group("Несколько любопытных коротышек", korotishka1, korotishka2, korotishka3);
        korotishki.useSkill(new GoToSkill(neznaika));
        // // Незнайка в испуге попятился и, прижавшись спиной к двери, приготовился защищаться.
        neznaika.useSkill(new AfraidSkill());
        // // Разглядев его измазанную физиономию, коротышки невольно рассмеялись.
        korotishki.useSkill(new SeeOn(neznaika));
        // // Незнайка понял, что бояться не надо, и его лицо тоже расплылось в улыбке. Громкий смех заглушил его слова.
        neznaika.useSkill(new LaughSkill());
        // // Все опять громко захохотали.
        korotishki.useSkill(new LaughSkill());
         // Begin lab3
         // Незнайка подошел к раковине и стал умываться под краном.
         // А коротышки заспорили между собой.
         // Одни утверждали, что Незнайка нарочно придумывает разные небылицы, чтоб сбить с толку полицию; другие говорили, что он попросту дурачок и болтает, что придет в голову; третьи решили, что он сумасшедший.
         // Тот, который был без рубахи, уверял всех, что Незнайка, должно быть, свихнулся с ума, начитавшись книжек, а в книжках на самом деле сказано, что за наружной Луной есть какие-то огромные планеты и звезды, на которых тоже якобы живут коротышки.
         // Вот он и вообразил, наверно, что прилетел к нам с такой планеты.
         // Сумасшедшие всегда воображают себя какими-нибудь великими личностями, знаменитостями или отважными путешественниками.
         // persons
         Thing sink = new Thing("Раковина");
         Book book = new Book("", new FirstStory());
         neznaika.useSkill(new LaughSkill());
         korotishka1.useSkill(new LaughSkill());
         korotishka2.useSkill(new LaughSkill());
         korotishka3.useSkill(new LaughSkill());
         korotishka4.useSkill(new LaughSkill());
         neznaika.useSkill(new GoToSkill(sink));
         neznaika.useSkill(new WashUpSkill(sink));
         korotishka1.useSkill(new ApproveSkill("Незнайка нарочно придумывает разные небылицы, чтоб сбить с толку полицию"));
         neznaika.setStatus(Status.STORYTELLER);
         korotishka2.useSkill(new ApproveSkill("Незнайка попросту дурачок и болтает, что придет в голову"));
         neznaika.setStatus(Status.FOOL);
         korotishka3.useSkill(new ApproveSkill("Незнайка сумасшедший"));
         neznaika.setStatus(Status.MADMAN);
         korotishka4.useSkill(new ApproveSkill("Незнайка, должно быть, свихнулся с ума, начитавшись книжек"));
         neznaika.setStatus(Status.CRAZY);
         korotishka4.useSkill(new ApproveSkill("Незнайка и вообразил, наверно, что прилетел к нам с такой планеты"));
         book.read();
         neznaika.setStatus(Status.ALIEN);
         neznaika.setStatus(Status.CRAZY);
         System.out.println(neznaika.getStatus().getDescription());
         // End lab3
        // // В это время Незнайка кончил умываться и спросил: <???>
        // // Незнайка подсел к коротышкам, которые грелись у печки.
        neznaika.useSkill(new SitDownSkill(polka));
        // // Стриженый тоже сел рядом.
        strizhenij.useSkill(new SitDownSkill(polka));
        // Стриженый достал из кармана несколько медных монеток.
        Item money10 = new Item("10 монет");
        Item money5 = new Item("5 монет");
        Item money1 = new Item("1 монетa");
        ItemContainer money = new ItemContainer("Немного монет", money1, money5, money10);
        strizhenij.items.add(money);
        strizhenij.useSkill(new ToHendSkill(strizhenij, money));
        // <???> С этими словами он стащил с Незнайки его голубую шляпу и сунул в руку монетки.
        Item hat = new Item("голубая шляпа");
        neznaika.items.add(hat);
        strizhenij.useSkill(new GetAtPersonSkill(neznaika, hat));
        strizhenij.useSkill(new GiveToPersonSkill(neznaika, money));
        // Вихрастый взял у Незнайки монетки.
        vichrastij.useSkill(new GetAtPersonSkill(neznaika, money));
        vichrastij.useSkill(new UnpackSkill(money));
        // Десять сантиков он незаметно сунул себе в карман, а пять сантиков зажал в кулаке и, подойдя к двери, негромко стукнул три раза.
        vichrastij.useSkill(new ToHendSkill(vichrastij, money5));
        vichrastij.useSkill(new KnockKnockSkill());
        // Звякнул замок. Дверь приоткрылась, и в нее заглянул уже знакомый нам полицейский Дригль.
//        door.open();
        Person drigl = new Person("Дригль");
        // Вихрастый отдал ему монетку.
        vichrastij.useSkill(new GiveToPersonSkill(drigl, money));
        // Дверь затворилась.
//        door.close();
        // Через некоторое время она снова открылась, и Дригль сунул вихрастому бумажный пакет с картошкой.
//        door.open();
        ItemContainer pack = new ItemContainer("Пакет", potato);
        vichrastij.items.add(pack);
        vichrastij.useSkill(new GiveToPersonSkill(drigl, pack));
    }
}
