### Rule expression parsing library
This library parses business rules, and can execute rules provided with context information
The rules will be of the form:

(amount > 1000.00 )

Rules can be defined for any domain as needed.

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

