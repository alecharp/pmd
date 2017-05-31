/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.dfa;

/**
 * @author raik
 */
public enum NodeType {
    ROOT("<ROOT>"),

    IF_EXPR("IF_EXPR"),
    IF_LAST_STATEMENT("IF_LAST_STATEMENT"),
    IF_LAST_STATEMENT_WITHOUT_ELSE("IF_LAST_STATEMENT_WITHOUT_ELSE"),
    ELSE_LAST_STATEMENT("ELSE_LAST_STATEMENT"),

    WHILE_EXPR("WHILE_EXPR"),
    WHILE_LAST_STATEMENT("WHILE_LAST_STATEMENT"),

    SWITCH_START("SWITCH_START"),
    CASE_LAST_STATEMENT("CASE_LAST_STATEMENT"),
    SWITCH_LAST_DEFAULT_STATEMENT("SWITCH_LAST_DEFAULT_STATEMENT"),
    SWITCH_END("SWITCH_END"),

    FOR_INIT("FOR_INIT"),
    FOR_EXPR("FOR_EXPR"),
    FOR_UPDATE("FOR_UPDATE"),
    FOR_BEFORE_FIRST_STATEMENT("FOR_BEFORE_FIRST_STATEMENT"),
    FOR_END("FOR_END"),

    DO_BEFORE_FIRST_STATEMENT("DO_BEFORE_FIRST_STATEMENT"),
    DO_EXPR("DO_EXPR"),

    RETURN_STATEMENT("RETURN_STATEMENT"),
    BREAK_STATEMENT("BREAK_STATEMENT"),
    CONTINUE_STATEMENT("CONTINUE_STATEMENT"),

    LABEL_STATEMENT("LABEL_STATEMENT"),
    LABEL_LAST_STATEMENT("LABEL_LAST_STATEMENT"),

    // TODO - throw statements?
    THROW_STATEMENT("THROW_STATEMENT");

    private String description;

    NodeType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
