/**
 *printing a binary tree in level order manner
 *this implementation uses queue data structure for level order traversing
*/

#include<iostream>
#include<queue>
using namespace std;

struct Node{
    int val;
    Node *left,*right;

    Node(int v) : val(v),left(nullptr),right(nullptr) {}
};

Node* insert(Node* root,int v){
    if(root == nullptr){
        return new Node(v);
    }
    if(v > root->val){
        root->right = insert(root->right,v);
    }
    else{
        root->left = insert(root->left,v);
    }
    return root;
}

void levelOrder(Node* root){
    if(root == nullptr)
        return;
    queue<Node*> q;
    q.push(root);
    while(!q.empty()){
        Node* tmp = q.front();
        cout<<tmp->val<<" ";
        q.pop();

        if(tmp->left != nullptr)
            q.push(tmp->left);
        if(tmp->right != nullptr)
            q.push(tmp->right);
    }
}

// driver code
int main(){
    Node* root = new Node(7);
    root->left = new Node(4);
    root->right = new Node(10);
    root->left->left = new Node(2);
    root->left->right = new Node(5);
    root->right->left = new Node(8);
    root->right->right = new Node(12);
    levelOrder(root);
    return 0;
}
