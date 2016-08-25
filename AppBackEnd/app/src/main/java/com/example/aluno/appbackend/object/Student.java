package com.example.aluno.appbackend.object;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aluno on 10/08/2016.
 */
public class Student {

    private String name;
    private String course;
    private String institution;
    private List<Competencie> competencies = new ArrayList<>();;
    private int userCode;
    private int period;
    private int year;
    private long ra;
    private List<Comment> comments = new ArrayList<>();

    public Student(String name, String course, String institution, List<Competencie> competencies, int userCode, int period, int year, long ra){

        this.name = name;
        this.course = course;
        this.institution = institution;
        this.competencies = competencies;
        this.userCode = userCode;
        this.period = period;
        this.year = year;
        this.ra = ra;

    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getInstitution() {
        return institution;
    }

    public List<Competencie> getCompetencies() {
        return competencies;
    }

    public int getUserCode() {
        return userCode;
    }

    public int getPeriod() {
        return period;
    }

    public int getYear() {
        return year;
    }

    public long getRa() {
        return ra;
    }
    
    public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
    public String toString()
    {
    	StringBuilder str = new StringBuilder();
    	
    	str.append("\nNome: ");
    	str.append(this.name);
    	str.append("\nCurso: ");
    	str.append(this.course);
    	str.append("\nInstitui��o: ");
    	str.append(this.institution);
    	str.append("\nUserCode: ");
    	str.append(this.userCode);
    	str.append("\nPeriodo: ");
    	str.append(this.period);
    	str.append("\nAno: ");
    	str.append(this.year);
    	str.append("\nRA: ");
    	str.append(this.ra);

    	str.append("\nCompetencias: ");
        
    	for(Competencie con : this.competencies)
    	{
    		str.append(con.toString());
    	}
    	
    	return str.toString();
    }

}