package com.expr.brule.newtests;

import java.io.IOException;

import net.sf.tweety.commons.Interpretation;
import net.sf.tweety.commons.ParserException;
import net.sf.tweety.logics.commons.analysis.BeliefSetInconsistencyMeasure;
import net.sf.tweety.logics.pl.analysis.ContensionInconsistencyMeasure;
import net.sf.tweety.logics.pl.parser.PlParser;
import net.sf.tweety.logics.pl.sat.LingelingSolver;
import net.sf.tweety.logics.pl.sat.Sat4jSolver;
import net.sf.tweety.logics.pl.sat.SatSolver;
import net.sf.tweety.logics.pl.syntax.*;

public class LogicTest {

	public LogicTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParserException, IOException {
		PlBeliefSet beliefSet = new PlBeliefSet();
		PlParser parser = new PlParser();
		beliefSet.add((PropositionalFormula) parser.parseFormula("a || b || c"));
		beliefSet.add((PropositionalFormula) parser.parseFormula("!a || b && d"));
		beliefSet.add((PropositionalFormula) parser.parseFormula("a"));
		beliefSet.add((PropositionalFormula) parser.parseFormula("!c"));

		System.out.println(beliefSet);

		SatSolver solver = new LingelingSolver("/Users/mthimm/Projects/misc_bins/lingeling");

		System.out.println(solver.getWitness(beliefSet));
	}

}
