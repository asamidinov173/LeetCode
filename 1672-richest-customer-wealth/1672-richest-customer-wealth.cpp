class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxWealthSoFar = 0;

        for (const vector<int>& customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;
    }
};