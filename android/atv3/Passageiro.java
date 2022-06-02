class Passageiro
{
    private String firstName;
    private String lastName;
    private String cpf;


    String getFirstName()
    {
        return this.firstName;
    }
    
    void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
        return;
    }

    String getLastName()
    {
        return this.lastName;
    }

    void setLastName(String newLastName)
    {
        this.lastName = newLastName;
        return;
    }

    String getCpf()
    {
        return this.cpf;
    }

    void setCpf(String newCpf)
    {
        this.cpf = newCpf;
        return;
    }

    Passageiro(String firstName, String lastName, String cpf)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setCpf(cpf);
    }

    Passageiro(String cpf)
    {
        setCpf(cpf);
    }

}