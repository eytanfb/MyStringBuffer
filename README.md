This is the code version of a StringBuffer implementation using TDD that I tried on white paper first. The paper version have some syntax errors but tests and methods are the same.
After initial commit, every new test step will be a new commit.

The last commit validates the code coverage to be 100% using EclEmma for Eclipse. This was also the first time I kinda used Infinitest for Eclipse and I kinda like it.

Odd thing: My code coverage for test was at 96% because assertTrue() statements were not covered for a reason. I don't know why, but I changed them to assertEquals() and both code and test have 100% coverage.
