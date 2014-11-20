app.filter('hppcParamsFilter', function() {
  return function(params) {
    var query = {
      from: (params.page() - 1) * params.count(),
      size: params.count()
    };
    angular.forEach(params.sorting(), function(dir, key) {
      query['sort-key'] = key;
      query['sort-dir'] = dir;
    });
    angular.forEach(params.filter(), function(value, key) {
      query['filter-' + key] = value;
    });
    return query;
  }
});