
----
Runge is missing
Gabriella is concerned about the goal of the tool
- The tool is not the only thing we need to contribute, we also need to include some research.
- We will only consider abstract values and not meta values. We pick the most abstract primitives, where we don't encounter computation issues.
We answer the questions that were in the current paper.
We already have some ideas for future work (CTL and LTL properties)
The restrictions we make should be thought out, and not just chosen due to time constraints.
We need to have other contributions than just the tool.
Give some examples of how the tools out put can be useful for a user.


We will look at code for next time
Moscow will be finalized
Interface will be chosen
Writing preliminaries will we started
Next meeting Monday 18th 09:00


#### How general is the solution?
General in the sense of value analysis, we will only be considering abstract values, not meta information like information flow or taint analysis.

Within this limitation we will restrict try to pick the most abstract/powerfull primitives possible, that do not encounter computation problems.

#### What is the expected input?
- SQL DDL statements.
- An automaton describing the environment/actors that act upon the database.
#### what is the goal of the tool? what will it offer? what are the properties of the output?
**What is the goal of the tool?**  
The goal of the tools is too provide an overestimating reachability analysis of the database given DDL statements and an automaton describing the environment.

**What will it offer?**  
An overestimation of reachable states, given the behavior of the environment.  
As future work we are considering being able to query the reachable state space for CTL or LTL properties.

**What are the properties of the output?**
- Sound (given that the description of the environment is accurate)
- Decidable

#### Will it correspond to select queries? If yes, will they have some restriction on the supported operations?
We see no reason to not use Select querries, so for now we will include it

#### Is there a fragment of SQL that will be fully supported? What is compromised by this?
DML and DDL, we dont currently see any compromise

#### Is there a relation between SQL import and parsing SQL?
No.  
Parsing should be in must have, and import should be in should have.

## What is the expected output of the analysis?
For each state in the transition system described in the behavior model of the domain a set of abstract database state not covering each other.

For future work we are considering being able to query this information with CTL or LTL.

#### Given the current requirements in the could have category, what is the expected form of interaction that will be supported?
We think it might just be an exe, the gives the user files as a respons
Kotlin API.

#### How is the description of the behavior related to the database schema and triggers?
The semantics of the behavior description should describe a transition system where the each transition corresponds to a collection of SQL DML statements.

#### The main contribution could be a tool, but usually there are multiple contributions and the open source prototype (tool) that demonstrates the advantages of the proposed solution could be one of them. In any case, it would be good to make clear what the tool is providing. What was missing that this tool is now offering? what are the possible uses of the tool?
In relation to a point in 1.d
> The reader should understand that a main contribution is  
> a open source tool.

#### Should reader have an understanding of all of SQL and abstract interpretation?
In relation to the following point in 1.d:

> The reader should hae a basic understanding of SQL.  
> The reader should understand abstract interpretation and  
> whatever semantics we are using.

The question is:

> all of it? articles usually include a background or preliminary section where the relevant concepts and methods from previous works are summarized (that is not exhaustive, but the main elements, and appropriate references for the reader to find more details)

Yes we are expecting to include such as section, but the description of SQL is going to be limited as there are plenty of resources and documentation for SQL.
We are expecting to give a concise description of abstract interpretation, covering the main points the reader needs to know.

#### Which primitives should the tool cover?
Strings, Integers, Reals.
