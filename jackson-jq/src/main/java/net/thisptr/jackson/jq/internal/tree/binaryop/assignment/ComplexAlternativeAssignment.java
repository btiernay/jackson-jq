package net.thisptr.jackson.jq.internal.tree.binaryop.assignment;

import net.thisptr.jackson.jq.JsonQuery;
import net.thisptr.jackson.jq.internal.operators.AlternativeOperator;

public class ComplexAlternativeAssignment extends ComplexAssignment {
	public ComplexAlternativeAssignment(final JsonQuery lhs, final JsonQuery rhs) {
		super(lhs, rhs, new AlternativeOperator());
	}
}
