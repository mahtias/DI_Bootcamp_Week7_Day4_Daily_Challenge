/**
 * @author N'ZO LAGOU
 * 1)
 * Utilisez la classe java.time.LocalDateet
 *  mettez en Periodœuvre les exercices suivants.

Les cours sont documentés ici et ici

Notez en particulier les méthodes suivantes de LocalDate 
LocalDate.now()
LocalDate.of(int year, int month, int dayOfMonth)
getDayOfWeek()
plusDays(long daysToAdd)
plusMonths(long monthsToAdd)
plusWeeks(long weeksToAdd)
plusYears(long yearsToAdd)

2) Quel jour de la semaine sommes-nous aujourd'hui ?

Imprimer quel jour de la semaine est aujourd'hui.
ASTUCE : créez aujourd'hui en tant que nouvel objet à l'aide de LocalDate.now() et demandez aujourd'hui quel jour de la semaine nous sommes.

Quel jour de la semaine est une date

Écrivez une méthode pour demander une date à l'utilisateur. L'utilisateur saisit le jour, le mois et l'année.
Signature:
 public static LocalDate askDate() {
        // Ask the user and return a new LocalDate
        }
Utilisez la méthode pour demander à l'utilisateur une date et imprimer quel jour de la semaine.  
 
 3) Quel jour de la semaine était votre anniversaire ?
 
 4) 
 Temps écoulé entre deux dates

Étudiez la documentation et trouvez s'il existe un moyen d'obtenir combien de jours, de mois et d'années séparent deux dates.
Quel âge as-tu, exactement, aujourd'hui ?

Jour aléatoire d'une année

Lorsqu'une année est donnée, choisissez un jour au hasard de cette année.
Signature:

 public static LocalDate randomDay(int year) {
    // Generate and return a new LocalDate
    }
Demandez à l'utilisateur une année, choisissez un jour aléatoire de cette année, imprimez-le et imprimez son jour de la semaine.
Assurez-vous de générer une date valide, le 31 avril est invalide et le 29 février est également invalide, mais pas tous les ans !
ASTUCE : la Java timebibliothèque sait quelles dates sont valides et lesquelles ne le sont pas, vous n'avez pas à écrire cette logique vous-même.
 */

package date.user;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class UserDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.getDayOfWeek());

		// 2

		LocalDate Date1 = askDate();

		System.out.println(Date1.getDayOfWeek());

		// 3

		LocalDate birthday = LocalDate.of(1994, 11, 19);

		System.out.println(birthday.getDayOfWeek());

		// 4

		LocalDate birthdayDate = askDate();

		Period age = Period.between(birthdayDate, localDate);

		System.out.println(" You have " + age.getYears() + " Years Old ");

		System.out.println("Jour genere " + randomDay(2023) + " : " + randomDay(2022).getDayOfWeek());

	}

	public static LocalDate askDate() {
		// Ask the user and return a new LocalDate

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");

		int year = sc.nextInt();

		System.out.println("Enter the Month");

		int month = sc.nextInt();

		System.out.println("Enter the day Of Month like 31");

		int dayOfMonth = sc.nextInt();

		return LocalDate.of(year, month, dayOfMonth);

	}

	// 5

	public static LocalDate randomDay(int year) {
		// Generate and return a new LocalDate
		/*
		 * Random random = new Random(); int day=random.nextInt(1, 32); int
		 * month=random.nextInt(1, 13);
		 * 
		 * LocalDate dateReturn=LocalDate.of(year, month, day);
		 */
		int dayOfYear = new Random().nextInt(1, 366);
		return LocalDate.ofYearDay(year, dayOfYear);

	}

}
