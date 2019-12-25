#include <iostream>

class A
{
public:
    void Test()
    {
        std::cout << "A" << std::endl;
    }
};
class B
{
public:
    B()
    {
        std::cout << "B Construct" << std::endl;
    }
    int Test()
    {
        std::cout << "B" << std::endl;
        return 1;
    }
};
class C : public B
{
public:
    C()
    {

    }
    void M()
    {
        B::Test();
    }
};

int main()
{
    C c;
    c.M();
}