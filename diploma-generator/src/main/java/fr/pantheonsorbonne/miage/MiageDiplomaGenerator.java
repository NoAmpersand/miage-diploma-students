package fr.pantheonsorbonne.miage;


import java.util.Arrays;
import java.util.Collection;
import java.util.Date;


import fr.pantheonsorbonne.miage.diploma.NameSnippet;
import fr.pantheonsorbonne.miage.diploma.DateSnippet;
import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;

public class MiageDiplomaGenerator extends AbstractDiplomaGenerator {

	private final Student student;
	private final Date date;

	/**
	 * Create the generator using a student name
	 * <p>
	 *
	 */
	public MiageDiplomaGenerator(Student student) {
		this(student, new Date());
	}

	public MiageDiplomaGenerator(Student student, Date date) {
		this.student = student;
		this.date = date;
	}

	@Override
	protected Collection<DiplomaSnippet> getDiplomaSnippets() {
		String studentName = this.student.getName() + " " + this.student.getTitle();
		return Arrays.asList(new DateSnippet(this.date), new NameSnippet(studentName));
	}

}
