### Rule expression parsing library
This library parses business rules, and gives you valuable insights into the rule's
composition like the no. of expressions, the business variables used
it can also be used to edit the rule in a systematic way (instead of just string replace)
A simple rule will be of the form:

`( amount > 1000.00 )`

Here the 'amount' is the business domain variable.  
Rules can be defined for any domain as needed.
You can write very complex rules with nested 'and' and 'or' conditions   
example:  
`( ( ( trade-amount > 1000000) & (risk-ind = "Y" )) | (risk-ind = "N") )`

The rule grammar is written as an ANTLR grammar, a .g4 file

### Rule Transformation
Any given business rule can be transformed in to its eqivalent XML
Comparing 2 rules as XML becomes easy using XMLUnit library

##### Rule String 
`ind=Y and amount = 1000000`

##### XML Representation
```xml
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<business-rule expressionCount="2" variables="[amount, ind]">
  <binaryExpression depth="1" operator="and">
    <variableExpression depth="1" position="1" text="ind=Y"/>
    <NumberExpression depth="1" position="2" text="amount=1000000"/>
  </binaryExpression>
</business-rule>
```

##### How to convert ?
```
		String rule = "ind=Y or amount = 1000000";
		System.out.println("Input rule: " + rule);
		RuleToXMLCoverter conv = new RuleToXMLCoverter(rule);
		conv.parseRule();
		System.out.println(conv.getXmlString());
```

