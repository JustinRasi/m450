exports.config = {
  framework: 'jasmine',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['./e2e/**/*.e2e-spec.ts'],
  plugins: [
    'karma-jasmine'
  ],
  capabilities: {
    'browserName': 'chrome'
  }
};
