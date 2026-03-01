**Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?**

Artemis Financial aimed to update its business processes and recognized the importance of implementing up-to-date, robust software security for its custom solutions. 
With a public-facing web platform, the company turned to Global Rain for guidance on safeguarding sensitive client and financial information.
To enhance security, Artemis Financial planned to introduce a file verification component within its web application, ensuring that data transfers would be protected 
through a verification process such as a checksum. My task was to enhance the existing software by integrating secure communication features that aligned with Artemis Financial’s security needs. 


**What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?**

I ensured that each vulnerability was addressed with targeted solutions, such as integrating secure communication protocols and implementing file verification to protect data in transit. 
Coding securely is essential because it helps prevent unauthorized access, data leaks, and other cyber threats that can compromise a company’s reputation and financial stability. 
Software security adds significant value to a company’s overall well-being by building client trust, ensuring compliance with industry regulations, and reducing the likelihood of costly 
incidents. Ultimately, robust security practices foster a safe environment for both clients and the organization, supporting long-term business success.


**Which part of the vulnerability assessment was challenging or helpful to you?**

Identifying and filtering false positives vs false negatives in the dependency check was the most challenging component of the vulnerability assessment.

**How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?**

To increase layers of security, I implemented a multi-faceted approach that included secure communication protocols and regular code reviews. 
By layering these defenses, I ensured that both data-in-transit and data-at-rest were protected from unauthorized access. In the future, 
I would utilize automated vulnerability scanners, penetration testing, and industry-standard frameworks like OWASP to systematically assess vulnerabilities 
and determine the most effective mitigation techniques. This combination of proactive assessment and robust mitigation strategies enables ongoing improvement 
and adaptation to evolving security threats.


**How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?**

I used the OWASP dependency checker to identify new potential vulnerabilities as new code was introduced to the codebase, along with regular code reviews and dry runs of the code to ensure that
false positives / negatives were identified and handled early.

**What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?**

The usage of the OWASP dependency checker will be helpful in future coding projects in ensuring that known vulnerabilities are addressed prior to pushing code to production.

**Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?**

From this assignment, I would present detailed documentation of the secure file verification component I integrated, along with code samples demonstrating the implementation of secure communication 
protocols. Additionally, I could showcase a report outlining the vulnerability assessment process, including the steps taken to identify and mitigate risks, as well as evidence of rigorous testing 
to ensure both functionality and security after refactoring. 


